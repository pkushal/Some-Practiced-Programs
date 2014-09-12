public class Recursion2 {
	public static void main(String[] args) {
		int[] kpp = { 6, 1,1, 6 };
		boolean ans = groupSum6(0, kpp, 8);
		System.out.println(ans);
	}

	public static boolean groupSum6(int start, int[] nums, int target) {
		System.out.println("\nStart bhayo");
		System.out.println("start : " + start);
		System.out.println("target: " + target);
		if (target == 0) {
			System.out.println("la hai target == 0 bhayo");
			for (int i = start; i < nums.length; ++i) {
				System.out
						.println("target 0 cha....6 ani chai chaina.. ani loop chai : "
								+ i);
				if (nums[i] == 6) {
					return false;
				}
			}
			return true;
		}
		if (target < 0) {
			System.out.println("Shit cross bhayo target nai..");
			return false;
		}
		if (start >= nums.length) {
			return false;
		}
		for (int i = start; i < nums.length; ++i) {
			System.out.println("For loop bhitra : " + i);
			System.out.println("nums[i]= " + nums[i]);
		

			if (groupSum6(i + 1, nums, target - nums[i])) {
				System.out.println("Simple condition ma hai yo");
				return true;
			}
		}
		return false;
	}
}
