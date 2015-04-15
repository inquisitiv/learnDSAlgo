
public class PowersOfFive {

	static int getmin(String S)
	{
		if(getNumber(S)==0)
			return -1;
		else
			return getMin(S);
		
	}
	
	static int getMin(String S){		
		
		if (S.isEmpty()){
			return 0;
		}

		if(getNumber(S)==0)
			return 0;
		
		if (S!=null && !S.isEmpty()){
			S = S.trim();
		}
		
		if(isPowerOf5(getNumber(S)))
			return 1;
		
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
				if(getNumber(substring)==0)
				{
					return 0;
				}
				while(substring.startsWith("0"))
				{
					k=k+1;
					start=start+1;
					substring = S.substring(k,end+1);
				}
				if(isPowerOf5(getNumber(substring)))
				{
					
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
		System.out.println(getmin("1101101111101"));
		System.out.println(getmin("101101101"));
		System.out.println(getmin("1000000000"));
    }
}
