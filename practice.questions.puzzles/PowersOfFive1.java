import java.util.TreeSet;


public class PowersOfFive1 {
	private static TreeSet<Integer> mySet;

	static int getMin(String S){
		
		if (S!=null && !S.isEmpty()){
			S = S.trim();
			
			if (isPowerOf5(getNumber(S))){
				return 1;
			}

			mySet = new TreeSet<Integer>();
			int start = 0;
			String substring = null;
			
			
			while (start<S.length()-1){
				int end = start+1;
				int result = 0;
				
				while (end<S.length()){
					substring = S.substring(start, end+1);
					
					if (isPowerOf5(getNumber(substring))){
						result++;
						start = end+1;
						end++;
					}
					end++;
				}
				mySet.add(result);
				start++;
			}
			return mySet.first();
		}
		return -1;
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
		System.out.println(getMin("101011101"));
	}

}
