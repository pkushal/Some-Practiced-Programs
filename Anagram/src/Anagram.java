import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	private static Scanner in;
	private static char[] cword;
	private static char[] cmatch;

	public static void main(String[] args) {
		System.out.println("~~~Welcome to Anagram Tester~~~");
		checkAnagram(getWord(), getMatch());
	}

	public static String getWord() {
		in = new Scanner(System.in);
		System.out.println("Enter the First word to test the anagram: ");
		String word = in.next();
		cword = new char[word.length()];
		return word;
	}

	public static String getMatch() {
		in = new Scanner(System.in);
		System.out.println("Enter the second word to test the anagram: ");
		String match = in.next();
		cmatch = new char[match.length()];
		return match;
	}

	public static void checkAnagram(String word, String match) {
			if (word.length() != match.length()) {
			System.out
					.println("the word lengths are different..So NOT ANAGRAM ");
		} else {
			System.out.println("Umm word lengths are also same ....");
					
			if (Arrays.equals(getArray(cword, word), getArray(cmatch,match))){
				System.out.println("Anagrams :) ");
			}
			else{
				System.out.println("Not anagrams :(");
			}
		}
	}


	public static char[] getArray(char carray[], String input) {
			for (int i = 0; i <= input.length() - 1; i++) {
			carray[i] = input.charAt(i);
			Arrays.sort(carray);
		}
	 return carray;
	}
}

