import java.lang.Character.Subset;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;


public class PowersOfFive3 {
	private static TreeSet<Integer> mySet;

	static int getMin(String S){		
		
		if (S.isEmpty()){
			return 0;
		}
		
		if (S!=null && !S.isEmpty()){
			S = S.trim();
		}
		
		String substring;
		int l1 = 0,end1=0;
		int start=0;
		int end = S.length()-1;
		int lenmax=0;
		while(end-start>1)
		{
			substring = S.substring(start,end+1);
			int k = start;
			while((end-k)>1)
			{
				substring = S.substring(k,end+1);
				while(substring.startsWith("0"))
				{
					k=k+1;
					start=start+1;
					substring = S.substring(k,end+1);
				}
				if(isPowerOf5(getNumber(substring)))
				{
					//System.out.print(substring+">");
					//String substring1 = S.substring(0,end+1);
					//substring = S.substring(end+1,S.length());
			        //lenmax=substring.length();
			        if(substring.length()>lenmax)
			        {
			        	lenmax=substring.length();
			        	l1=k;
			        	end1=end;
			        	break;
			        }
			        else
			        	{
			        	start++;
			        	k++;
			        	end=S.length()-1;
			        	}
			       
				}
				 else
						end--;
			}
			start++;
			end=S.length()-1;
		}
		if(lenmax>0)
		{
	    System.out.println(S.substring(l1,end));
		return getMin(S.substring(0,l1))+1+getMin(S.substring(end1+1,S.length()));
		}
		else
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
		System.out.println(getMin("1101101111101"));
		System.out.println(getMin("101101101"));
		System.out.println(getMin("000000000"));
    }
}

