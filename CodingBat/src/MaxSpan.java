public class MaxSpan {
	private static int[] nums = {};

	public static void main(String[] args) {
		int out = maxSpan(nums);
		System.out.println(out);
	}

	public static int maxSpan(int[] nums) {
		System.out.println("Total length of an array: "+nums.length);
		if (nums.length == 1) {
			System.out.println("length is equal to 1 condition");
			return 1;
		} else if (nums.length == 0) {
			System.out.println("Array is null condition");
			return 0;
		} else {
			System.out.println("Normal array condition");
			return nums.length - 1;
		}
	}
}
