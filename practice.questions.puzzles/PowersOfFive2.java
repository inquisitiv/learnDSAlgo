import java.lang.Character.Subset;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;


public class PowersOfFive2 {
	private static TreeSet<Integer> mySet;
	private static TreeMap<Integer,Integer> myMap;
	private static ArrayList<Integer> resultValues;

	static int getMin(String S){
		int result = 0;
		int temp;			
		if(!S.isEmpty() && getNumber(S)==1)
			return 0;
		if (S!=null && !S.isEmpty()){
			S = S.trim();
		while(S.startsWith("0"))
		{
		    return getMin(S.substring(1,S.length()));
		}
			if (isPowerOf5(getNumber(S))){
				System.out.print(S+">");
				return 1;
			}
			mySet = new TreeSet<Integer>();
			int start = 0;
			int end = S.length()-1;
			String substring;
			while((end-start)>1)
			{
				result = 0;
				substring = S.substring(start,end+1);
				while(substring.startsWith("0"))
				{
					start++;
					substring = S.substring(start,end+1);
				}
				int k = start;
				while((end-k)>1)
				{
					substring = S.substring(k,end+1);
					if(isPowerOf5(getNumber(substring)))
					{
						System.out.print(substring+">");
						String substring1 = S.substring(0,end+1);
						substring = S.substring(end+1,S.length());
				        return getMin(substring1)+1+getMin(substring);
					}
					else
					end--;
				}
				//if(result!=0)
				//mySet.add(result);
				start++;
				end=S.length()-1;
			}
		}
		return 0;
		
	}
	
	private static int getNumber(String s){
		return Integer.parseInt(s, 2);
	}
	
	public static boolean isPowerOf5(int x) {
        while (x%5==0){
        	x = x/5;
        }
        return x==1;
    }
	
	public static void main(String[] args) {
		//System.out.println(getMin("1101101111101"));
		//System.out.println(getMin("10101111101"));
		//System.out.println(getMin("101111101010"));
		//System.out.println(getMin("101101"));
		TreeSet<Integer> set = new TreeSet<>();
		//String s = "1011001111101011001111101";
		String s = "101101101";
		//System.out.println(getMin(s));
		//String s = "101111101010";
		int value;
		int start = 0;
		int end = s.length()-1;
		
		if(getNumber(s)==0)
		System.out.println("-1");
		else
		{
		while(end-start>1)
		{
			value = getMin(s.substring(0,start))+getMin(s.substring(start,end+1));
			System.out.println();
			set.add(value);
			start++;
		}
		System.out.println();
		for(int x : set)
		{
			if(x!=0)
			{
			System.out.println(x);
			break;
			}
		}
		}
		
		//String s = "101101";
		
	}

}
