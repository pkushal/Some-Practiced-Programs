
public class Recursion {
public static void main(String[] args) {
	int[] kpp = {17,2,4,9,2};
	boolean ans =groupSum(0, kpp, 14);
	System.out.println(ans);
}


public static boolean groupSum(int start, int[] nums, int target) {
	System.out.println("start: " + start);
	System.out.println("nums : " + nums);
	System.out.println("target : " + target);
	if (target == 0) {
		System.out.println("hu la la ....");
		return true;
	}
	if (start >= nums.length) {
		System.out.println("nums.length: " + nums.length);
		
		return false;
	}
	for (int i = start; i < nums.length; ++i) {
		System.out.println("For loop iteration i= " + i);
		if (nums[i] > target) {
			System.out.println("\n Skipping this iteration...");
			continue;
		}
		System.out.println("wala...");
		
		if (groupSum(i + 1, nums, target - nums[i])) {
			System.out.println("howdy...");
			return true;
		}
	}
	return false;
}
}
