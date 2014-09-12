public class CommonTwo {
	private static int start = 0;
	private static String[] lg;
	private static String[] st;
	private static int count = 0;

	public static void main(String[] args) {
		String[] A = {"a", "b", "c", "c", "d"};
		String[] B = {"a", "b", "b", "c", "d", "d"};
		commonTwo(A, B);
		System.out.println("total number of overlap is: " + count);
	}

	public static int commonTwo(String[] a, String[] b) {
		String temp = null;

		if (a.length >= b.length) {
			lg = a;
			st = b;
		} else {
			lg = b;
			st = a;
		}
		for (int i = 0; i <= st.length - 1; i++) {
			if (st[i].equals(temp)) {
				System.out.println("Purano");
				
			} else {
				for (int j = start; j <= lg.length - 1; j++) {
					if (st[i].equals(lg[j])) {
						System.out.println("Found one ");
						count += 1;
						start = j;
						temp = st[i];
						break;
					}
				}
			}
		}
		return count;
	}
}
