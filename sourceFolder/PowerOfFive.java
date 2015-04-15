import java.util.ArrayList;

public class PowerOfFive {

	static int getmin(String S) {
		if (getNumber(S) == 0)
			return -1;
		else
			return getMin(S);

	}

	static int getMin(String S) {

		if (S.isEmpty()) {
			return 0;
		}

		if (getNumber(S) == 0)
			return 0;

		if (isPowerOf2(getNumber(S))) {
			// System.out.println(1);
			return 1;

		}

		if (getNumber(S) == 1) {
			// System.out.println(1);
			return 1;
		}

		if (S != null && !S.isEmpty()) {
			S = S.trim();
		}

		if (isPowerOf5(getNumber(S))) {
			// System.out.println(S);
			return 1;
		}

		while (S.startsWith("0")) {
			return getMin(S.substring(1, S.length()));
		}

		while (S.endsWith("0")) {
			return getMin(S.substring(0, S.length() - 1));
		}

		if (isPowerOf2(getNumber(S) + 1)) {
			// System.out.println(S);
			return S.length();
		}

		String substring;
		ArrayList<Integer> lens = new ArrayList<Integer>();
		ArrayList<Integer> ends = new ArrayList<Integer>();
		int start = 0;
		int end = S.length() - 1;
		int lenmax = 0;
		while (end - start > 1) {
			substring = S.substring(start, end + 1);
			int k = start;
			while ((end - k) > 1) {
				substring = S.substring(k, end + 1);

				if (getNumber(substring) == 0) {
					break;
				}
				while (substring.startsWith("0")) {
					k = k + 1;
					start = start + 1;
					substring = S.substring(k, end + 1);
				}
				while (substring.endsWith("0")) {
					end--;
					substring = S.substring(k, end + 1);
				}

				if (isPowerOf5(getNumber(substring))
						&& substring.length() > lenmax) {
					lenmax = substring.length();
					lens.clear();
					ends.clear();
					lens.add(k);
					ends.add(end);
					break;
				} else if (isPowerOf5(getNumber(substring))
						&& substring.length() == lenmax) {
					lens.add(k);
					ends.add(end);
					break;
				} else
					end--;
			}
			start++;
			end = S.length() - 1;
		}
		int g = 0;
		int min = Integer.MAX_VALUE;
		if (lenmax > 0) {
			for (int i = 0; i < lens.size(); i++) {
				// System.out.println(S.substring(lens.get(i),ends.get(i)+1));
				g = getMin(S.substring(0, lens.get(i))) + 1
						+ getMin(S.substring(ends.get(i) + 1, S.length()));
				if (g < min && g > 0)
					min = g;
			}
			return min;
		} else
			return 0;

	}

	private static int getNumber(String s) {
		return Integer.parseInt(s, 2);
	}

	public static boolean isPowerOf5(int x) {
		while (x % 5 == 0) {
			x = x / 5;
		}
		return x == 1;
	}

	public static boolean isPowerOf2(int x) {
		while (x % 2 == 0) {
			x = x / 2;
		}
		return x == 1;
	}

	public static void main(String[] args) {
		System.out.println("---------------------------------------");
		System.out.println("K min is : \n" + getmin("1101101111101"));
		System.out.println("---------------------------------------");
		System.out.println("K min is : \n" + getmin("101101101"));
		System.out.println("---------------------------------------");
		System.out.println("K min is : \n" + getmin("1000000000"));
		System.out.println("---------------------------------------");
		System.out.println("K min is : \n" + getmin("000000000"));
		System.out.println("---------------------------------------");
		System.out.println("K min is : \n" + getmin("10110011011001101000"));
		System.out.println("---------------------------------------");
		System.out.println("K min is : \n" + getmin("01111101111101"));
		System.out.println("---------------------------------------");
	}
}