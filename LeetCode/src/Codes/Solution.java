package Codes;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println("My answer is : " + s.divide(21, 3));
	}

	public int divide(int dividend, int divisor) {
		long a = Math.abs((long) dividend);
		long b = Math.abs((long) divisor);
		int ans = 0, i = 0;
		while (a > b) {
			System.out.println("b: "+b);
			i++;
			b = b << 1;
		}
		while (i >= 0) {
			if (a >= b) {
				a -= b;
				ans += (1 << i);
			}
			b = b >> 1;
			i--;
		}

		return (((dividend >> 31) == (divisor >> 31))) ? ans : -ans;
	}
}
