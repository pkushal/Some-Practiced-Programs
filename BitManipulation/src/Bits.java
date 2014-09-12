public class Bits {
	private static int ans;

	public static void main(String[] args) {
		System.out.println("\nFinal answer is : " + insertBit(1024, 19, 2, 6));
	}

	public static int insertBit(int N, int M, int k, int l) {
		ans = N;
		int len = l - k + 1;
		System.out.println("Given Big string : " + N);
		System.out.println("To be inserted string : " + M);
		System.out.println("Push between range " + l + " and " + k);
		for (int i = 0; i < len; i++) {
			int v = 0;
			int temp = M & (1 << i); // finding the each bit of the given M
										// integer
			if (temp > 0) {
				v = 1;
			}

			// update the k th bit from the integer N with temp value
			ans = (ans & (~(1 << k)) | (v << k)); // first that particular bit
													// is set to zero and
													// logical OR operation with
													// temp value
			k++;
		}
		return ans;
	}
}
