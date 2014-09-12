package SampleTest;

/**
 * finds the second largest int in the given array
 * 
 * @author Tina Kinkennon
 * 
 */
public class SecondLargest {
	static int[] arr = { 7, 3, 21 };

	public static void main(String[] args) {
		System.out.println(secondLargest(arr));
	}

	public static int secondLargest(int[] arr) {
		if (arr.length < 2) {
			return -1;
		}
		int max = arr[0];
		int sec = -1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				sec = max;
				max = arr[i];
				continue;
			}
			if (arr[i] > sec) {
				sec = arr[i];
			}
		}
		if (max == sec) {
			return -1;
		} else
			return sec;
	}
}
