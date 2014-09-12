public class StrDist {
	private static int n = 0;
	private static int start = -1;
	private static int stop = 0;

	public static void main(String[] args) {
		int ans = strDis("catcowcat", "t");
		System.out.println("The total length is " + ans);
	}

	public static int strDis(String str, String sub) {
		int sublen = sub.length();
		int strlen = str.length();
		if (strlen >= n + sublen) {
			if (str.substring(n, n + sublen).equals(sub)) {
				if (start == -1) {
					start = n;
				} else {
					stop = n + sublen;
				}
				n = n + sublen;
				strDis(str, sub);
			}

			else {
				n += 1;
				strDis(str, sub);
			}
		}
		int result;
		if (stop ==0 && start >=0) {result = sublen;}
		else if (start ==-1 && stop ==0){result =0;}
		else {result = stop - start;}
		return result;
	}
}
