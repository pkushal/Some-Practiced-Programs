package SampleTest;

public class CharReturn {
	static char[] carr = { 'a', 'b', 'c', 'd', 'e','f' };

	public static void main(String[] args) {
		display(function(carr, 2, 4));
	}

	public static char[] function(char[] carr, int start, int stop) {
		int length = carr.length;
		char[] ans = new char[stop];
		if (start > length - 1 || stop > length || start < 0 || stop < 0
				|| start + stop - 1 > length - 1) {
			return ans;
		}
		int j = 0;
		for (int i = start; i < start + stop; i++) {
			ans[j] = carr[i];
			j++;
		}

		return ans;
	}

	public static void display(char[] carr) {
		if (carr.length == 0) {
			System.out.println("Null");
			return;
		}
		for (int i = 0; i < carr.length; i++) {
			System.out.println(carr[i]);
		}
	}
}
