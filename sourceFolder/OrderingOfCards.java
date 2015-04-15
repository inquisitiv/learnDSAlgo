import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class OrderingOfCards {

	private static class dimension implements Comparable<dimension> {
		int[][] getDimension;
		int area;
		char c;
		int visibility;
		int hf;
		int vf;

		public dimension(int[][] a, char c, int area, int visibilty, int h,
				int v) {
			getDimension = a;
			this.c = c;
			this.area = area;
			this.visibility = visibilty;
			hf = h;
			vf = v;
		}

		@Override
		public int compareTo(dimension o) {

			// TODO Auto-generated method stub
			return new dimensionComparator().compare(this, o);
		}

		private class dimensionComparator implements Comparator<dimension> {

			@Override
			public int compare(dimension o1, dimension o2) {

				if (o1.getDimension[1][0] < o2.getDimension[0][0]
						|| o2.getDimension[1][0] < o1.getDimension[0][0]
						|| o1.getDimension[1][1] < o2.getDimension[0][1]
						|| o2.getDimension[1][1] < o1.getDimension[0][1]) {
					return equals(o1, o2);
				} else if (o1.hf > o2.hf || o1.vf > o2.vf)
					return -1;
				else if (o1.hf == o2.hf && o1.vf == o2.vf) {
					if (o1.visibility < o2.visibility)
						return -1;
					else if ((o1.visibility == o2.visibility)) {
						return 0;
					}

					else
						return 1;
				}

				else
					return 1;

			}

			private int equals(dimension o1, dimension o2) {

				if (o1.c < o2.c)
					return -1;
				else if (o1.c == o2.c)
					return 0;
				else
					return 1;
			}

		}
	}

	private static HashMap<Character, dimension> map;

	public static String findOrder(String[] grid) {
		map = new HashMap<Character, dimension>();

		for (int i = 0; i < grid.length; i++) {
			int len = grid[i].length();
			for (int j = 0; j < len; j++) {
				if (!(grid[i].toCharArray()[j] == '.')) {
					if (map.isEmpty())
						map.put(grid[i].toCharArray()[j],
								new dimension(
										new int[][] { { i, j }, { i, j } },
										grid[i].toCharArray()[j], 0, 1, 0, 0));
					else if (!map.containsKey(grid[i].toCharArray()[j]))
						map.put(grid[i].toCharArray()[j],
								new dimension(
										new int[][] { { i, j }, { i, j } },
										grid[i].toCharArray()[j], 0, 1, 0, 0));
					else {
						map.get(grid[i].toCharArray()[j]).visibility++;
						int i1 = map.get(grid[i].toCharArray()[j]).getDimension[0][0];
						int i2 = map.get(grid[i].toCharArray()[j]).getDimension[1][0];
						int j1 = map.get(grid[i].toCharArray()[j]).getDimension[0][1];
						int j2 = map.get(grid[i].toCharArray()[j]).getDimension[1][1];
						if (i < i1) {
							map.get(grid[i].toCharArray()[j]).getDimension[0][0] = i;
							i1 = i;
						}
						if (i > i2) {
							map.get(grid[i].toCharArray()[j]).getDimension[1][0] = i;
							i2 = i;
						}
						if (j < j1) {
							map.get(grid[i].toCharArray()[j]).getDimension[0][1] = j;
							j1 = j;
						}
						if (j > j2) {
							map.get(grid[i].toCharArray()[j]).getDimension[1][1] = j;
							j2 = j;
						}
						map.get(grid[i].toCharArray()[j]).area = (j2 - j1 + 1)
								* (i2 - i1 + 1);
						map.get(grid[i].toCharArray()[j]).hf = j2 - j1;
						map.get(grid[i].toCharArray()[j]).vf = i2 - i1;
						if ((grid[i1].toCharArray()[j1] == grid[i2]
								.toCharArray()[j2])
								&& (grid[i1].toCharArray()[j2] == grid[i2]
										.toCharArray()[j1])
								&& (grid[i1].toCharArray()[j1] != grid[i1]
										.toCharArray()[j2]))
							return "ERROR!";
					}
				}
			}
		}
		ArrayList<dimension> answer = new ArrayList<dimension>();
		dimension temp;
		for (dimension x : map.values()) {
			temp = new dimension(x.getDimension, x.c, x.area, x.visibility,
					x.hf, x.vf);
			answer.add(temp);

		}

		Collections.sort(answer);

		StringBuilder ans = new StringBuilder();
		for (dimension x : answer) {

			ans.append("").append(x.c);

		}

		return ans.toString();
	}

	public static void main(String[] args) {

		System.out.println(findOrder(new String[] { "..AA..", ".CAAC.",
				".CAAC." }));
		System.out.println(findOrder(new String[] { "CAA", "AAA", "ACC" }));
		System.out.println(findOrder(new String[] { "CABB", "ACBC" }));
		System.out.println(findOrder(new String[] { "CA", "AC" }));
		System.out.println(findOrder(new String[] { "bbb666", ".655X5",
				"a65AA5", "a65AA5", "a65555" }));

	}

}
