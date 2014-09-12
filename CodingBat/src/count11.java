public class count11 {
	private static int n = 0;
	private static int count = 0;

	public static void main(String[] args) {
		counts11("Hello");
		
		System.out.println(count);

	}

	public static int counts11(String str) {
		if (str.length()<=1)
			return 0;
		else
		{
		System.out.println("Hi there  ");
		System.out.println("string length: " + str.length());
		System.out.println(str.substring(n, n + 2));
		if (str.substring(n, n + 2).equals("11")) {
			count += 1;
			n = n + 2;
			System.out.println("value of n: " + n);
			if (str.length()>=n+2){
				counts11(str);
			}
			
		} else {
			n = n + 1;
			System.out.println("value of n: " + n);
			if (str.length()>=n+2){
				counts11(str);
			}
			
		}
		return count;
		}
	}
}
