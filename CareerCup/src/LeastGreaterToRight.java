//In Java

import java.util.ArrayList;
import java.util.Collections;

public class LeastGreaterToRight {
	private static int[] arr = { 8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93,
			25, 80, 28 };
	public static ArrayList<Integer> temp = new ArrayList<Integer>();
	public static ArrayList<Integer> sorted = new ArrayList<Integer>();

	public static void main(String[] args) {
		System.out.println(ssort(arr));
	}

	public static ArrayList<Integer> ssort(int[] arr) {

		for (int i = 0; i <= arr.length - 1; i++) {
			if (i <= arr.length - 2) {
				temp.clear();
				for (int j = i + 1; j <= arr.length - 1; j++) {
					temp.add(arr[j]);
				}

				Collections.sort(temp);
				int shit = 0;

				for (int k = 0; k < temp.size(); k++) {

					if (temp.get(k) > arr[i]) {

						sorted.add(temp.get(k));
						temp.clear();
						shit = 1;
						break;
					}

				}
				if (shit == 0) {
					sorted.add(-1);
				}
			} else {
				sorted.add(-1);
			}
		}
		return sorted;
	}
}
