package unique;

import java.util.Arrays;

public class UniqueElement {
	public static void main(String[] args) {
		int[] values = { 2, 4, 2, 5, 9, 6, 9, 8, 3, 45 };
		findUnique(values);
	}

	public static void findUnique(int[] val) {
		Arrays.sort(val);
		display(val);

		return;
	}

	private static void display(int[] val) {
			
//		for (int i = 0; i < val.length; i++) {
//			System.out.print(val[i] + "\t");
//			System.out.println();
//		}
	}
}
