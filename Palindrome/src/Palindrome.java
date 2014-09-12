import java.util.Scanner;

public class Palindrome {
	private static int condition;

	public static void main(String[] args) {
		String input = getInput();
		isPalindrome(input);
	}

	public static String getInput() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the word to check the palindrome: ");
		return in.nextLine();
	}

	public static void isPalindrome(String word) {
		System.out.println("You mean " + word + " right ? ");
		int length = word.length() - 1;
		for (int i = 0; i <= length; i++) {
			String front = Character.toString(word.charAt(i));
			String back = Character.toString(word.charAt(length - i));
			if (front.equals(back)) {
				condition = 2;
			} else {
				condition = 4;
				break;
			}
		}

		if (condition == 2) {
			System.out.println(word + " is a Palindrome  :) !!");
		} else {
			System.out.println(word + " is NOT a Palindrome :( ");
		}

	}
}
