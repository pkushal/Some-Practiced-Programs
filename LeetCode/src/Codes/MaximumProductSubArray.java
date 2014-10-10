package Codes;

public class MaximumProductSubArray {
	public static void main(String[] args) {
		MaximumProductSubArray m = new MaximumProductSubArray();
		int[] arr = { -5, 2, 4, 1, -2, 2, -6, 3, -1, 1, -1, 1, 1, 1, -1, -1,
				-1, 1, -1, -1, -1, -1, -1, -1 };
		System.out.println("The maximum product of subarray is: "
				+ m.maxProduct(arr));
	}

	public int maxProduct(int[] A) {
		if (A == null || A.length == 0) {
			return 0;
		}
		int[] ans = new int[A.length];
		ans[0] = A[0];
		int val = ans[0];
		for (int i = 1; i < A.length; i++) {
			ans[i] = Math.max(A[i], A[i] * ans[i - 1]);
			val = Math.max(val, ans[i]);
		}
		return val;
	}
}
