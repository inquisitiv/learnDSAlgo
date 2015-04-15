
public class Test {

	public static void main(String[] args) {
		
		System.out.println(Integer.parseInt("1111101111101",2));
		System.out.println(isPowerOf5(Integer.parseInt("1111101111101",2)));
	}
	public static boolean isPowerOf5(int x) {
        while (x%5==0){
        	x = x/5;
        }
        return x==1;
}
}
