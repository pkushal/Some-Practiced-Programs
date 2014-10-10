package Codes;

public class LongestSubString {
	public static void main(String[] args) {
		LongestSubString l = new LongestSubString();
		System.out.println("The maximum length of the substring is: "
				+ l.lengthOfLongestSubstring("ruowzgiooobpple"));
	}

	public int lengthOfLongestSubstring(String s) {
		if (s.length() < 1) {
			return 0;
		}
		int[] indexes = new int[256];
		int start = 0;
		int maxLengthSoFar = 1;
		int thisLength = 0;
		int i;
		
		for (int j = 0; j < 256; j++) {
			indexes[j] = -1;
		}
		
		
		for (i = 0; i < s.length(); i++) {

			char now = s.charAt(i);
			// if something new comes just put it in the correct index
			if (indexes[now] == -1 || indexes[now] < start) {
				System.out.println("i..." + i);
				indexes[now ] = i;
			}

			else if (indexes[now ] != -1 || indexes[now] != i) {

				System.out.println("Start: " + start);
				System.out.println("looks like there is a collision at:" + i);

				thisLength = i - start;
				maxLengthSoFar = Math.max(maxLengthSoFar, thisLength);

				System.out.println("Maxlength so far: " + maxLengthSoFar);

				start = indexes[now ] + 1;
				indexes[now ] = i;

				System.out.println("Now starting at :" + start);

				System.out.println();
				System.out.println();

			}

		}
		i--;
		System.out.println("MAX LENGTH OUTSIDE THE FOR LOOP " + maxLengthSoFar);
		System.out.println("i:" + i + " start:" + start);
		thisLength = i - start + 1;
		maxLengthSoFar = Math.max(maxLengthSoFar, thisLength);
		System.out.println("MAX LENGTH AFTER READJUSTMENT THE FOR LOOP "
				+ maxLengthSoFar);

		return maxLengthSoFar;
	}
}












//public int lengthOfLongestSubstring(String s) {
//	if (s.length() < 1) {
//		return 0;
//	}
//	int[] indexes = new int[26];
//	int start = 0;
//	int maxLengthSoFar = 1;
//	int thisLength = 0;
//	int i;
//	for (int j = 0; j < 26; j++) {
//		indexes[j] = -1;
//	}
//	for (i = 0; i < s.length(); i++) {
//
//		char now = s.charAt(i);
//		// if something new comes just put it in the correct index
//		if (indexes[now - 'a'] == -1 || indexes[now - 'a'] < start) {
//			System.out.println("i..." + i);
//			indexes[now - 'a'] = i;
//		}
//
//		else if (indexes[now - 'a'] != -1 || indexes[now - 'a'] != i) {
//
//			System.out.println("Start: " + start);
//			System.out.println("looks like there is a collision at:" + i);
//
//			thisLength = i - start;
//			maxLengthSoFar = Math.max(maxLengthSoFar, thisLength);
//
//			System.out.println("Maxlength so far: " + maxLengthSoFar);
//
//			start = indexes[now - 'a'] + 1;
//			indexes[now - 'a'] = i;
//
//			System.out.println("Now starting at :" + start);
//
//			System.out.println();
//			System.out.println();
//
//		}
//
//	}
//	i--;
//	System.out.println("MAX LENGTH OUTSIDE THE FOR LOOP " + maxLengthSoFar);
//	System.out.println("i:" + i + " start:" + start);
//	thisLength = i - start + 1;
//	maxLengthSoFar = Math.max(maxLengthSoFar, thisLength);
//	System.out.println("MAX LENGTH AFTER READJUSTMENT THE FOR LOOP "
//			+ maxLengthSoFar);
//
//	return maxLengthSoFar;
//}
