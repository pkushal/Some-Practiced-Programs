package SampleTest;

/**
 * Find the difference between X and Y X is the sum of the odd numbers in the
 * array Y is the sum of the even numbers in the array
 * 
 * @author Tina Kinkennon
 * 
 */
public class Difference {
	static int[] arr = { 1, 2, 3, 1 };

	public static void main(String[] args) {
		System.out.println(function(arr));
	}

	public static int function(int[] arr) {
		int even = 0;
		int odd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				even += arr[i];
			else
				odd += arr[i];
		}
		return odd - even;
	}
}
