import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;


public class HouseOfCards{

    private static class dimension  implements Comparable<dimension>
    {
    	int[][] getDimension;
    	int area;
    	char c;
    	int visibility;

    	
    	public dimension(int[][] a, char c, int area,int visibilty)
    	{
    		getDimension = a;
    		this.c=c;
    	    this.area = area;
    	    this.visibility = visibilty;
    	}
    	
    	@Override
    	public int compareTo(dimension o) {
    		
    		// TODO Auto-generated method stub
    		return new dimensionComparator().compare(this, o);
    	}    	
    	private class dimensionComparator implements Comparator<dimension>{

			@Override
			public int compare(dimension o1, dimension o2) {
				// TODO Auto-generated method stub
				if(o1.area>o2.area)
					return 1;
				else if(o1.area==o2.area)
				{
					   if(o1.visibility<o2.visibility)	
						   return 1;
					   else if(o1.visibility==o2.visibility)
						   {
						   if(o1.c>o2.c)
								return 1;
						   else if(o1.c==o2.c)
							   return 0;
						   else 
							   return 1;
						   }
					   else
						   return -1;
					}	
				else
					return -1;
				
			}
    		
    	}
    }
	private static HashMap<Character,dimension> map;
	
	public static String findOrder(String[] grid)
	{
		map = new HashMap<Character,dimension>();
		
		for(int i=0; i<grid.length; i++)
		{ 
			int len = grid[i].length();
			for(int j=0;j<len;j++)
			{
				if(!(grid[i].toCharArray()[j]=='.'))
				{				
				if(map.isEmpty())
				map.put(grid[i].toCharArray()[j],new dimension(new int[][]{{i,j},{i,j}},grid[i].toCharArray()[j],0,1));
				else if(!map.containsKey(grid[i].toCharArray()[j]))
				map.put(grid[i].toCharArray()[j],new dimension(new int[][]{{i,j},{i,j}},grid[i].toCharArray()[j],0,1));
				else
				{
					map.get(grid[i].toCharArray()[j]).visibility++;
					int i1=map.get(grid[i].toCharArray()[j]).getDimension[0][0];
					int i2=map.get(grid[i].toCharArray()[j]).getDimension[1][0];
					int j1=map.get(grid[i].toCharArray()[j]).getDimension[0][1];
					int j2=map.get(grid[i].toCharArray()[j]).getDimension[1][1];
					if(i<map.get(grid[i].toCharArray()[j]).getDimension[0][0])
					{
						map.get(grid[i].toCharArray()[j]).getDimension[0][0]=i;
						i1=i;
					}
					if(i>map.get(grid[i].toCharArray()[j]).getDimension[1][0])
					{
						map.get(grid[i].toCharArray()[j]).getDimension[1][0]=i;
						i2=i;
					}
					if(j<map.get(grid[i].toCharArray()[j]).getDimension[0][1])
					{
						map.get(grid[i].toCharArray()[j]).getDimension[0][1]=j;
						j1=j;
					}
					if(j>map.get(grid[i].toCharArray()[j]).getDimension[1][1])
					{
						map.get(grid[i].toCharArray()[j]).getDimension[1][1]=j;
						j2=j;
					}
					map.get(grid[i].toCharArray()[j]).area=(j2-j1+1)*(i2-i1+1);
				}
				}
			}
		}
			ArrayList<dimension> answer = new ArrayList<dimension>();
			dimension temp;
			for(dimension x : map.values())
			{
				temp = new dimension(x.getDimension,x.c,x.area,x.visibility);
				answer.add(temp);
				
			}
			
			Collections.sort(answer);
			StringBuilder ans = new StringBuilder();
			for(dimension x : answer)
			{
				
				ans.append("").append(x.c);
				
			}
			
			return ans.toString();
		}
		
	
	public static void main(String[] args) {
		
		System.out.println(findOrder(new String[]{"..AA..",".CAAC.",".CAAC."}));
		
	}



	
}
