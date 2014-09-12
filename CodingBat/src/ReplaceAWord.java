import java.util.Scanner;

public class ReplaceAWord {
	private static int white = 0;
	private static String word;
	private static String out = "";
	private static String str = "is is and id is";
	private static Scanner scan = new Scanner(str);

	public static void main(String[] args) {
		notReplace(str);
	}

	public static String notReplace(String str) {

		for (int i = 0; i < str.length(); i++) {
			if (Character.isWhitespace(str.charAt(i)))
				white += 1;
		}
		  System.out.println(white);
		  
		for (int i = 0; i <= white; i++) {
			word = scan.next();
			System.out.println(word);
			if (word.equals("is")) {

				out = out + " "+word.replace("is", "is not");
			} else {
				out = out + " " + word;
			}
		}
		System.out.println(out);
		return out;
	}
}
