import java.util.Scanner;

public class WordCountMain {

	public static Scanner in;
	public static String location;
	public static String target;
	
	public static void main(String[] args) {
		in= new Scanner (System.in);
		System.out.println("Please enter the file location for the word count: ");
		location = in.nextLine();
		System.out.println("\nSo you mean " + location + " right? ");
		
		System.out.println("\nPlease enter the word to be counted: ");
		target = in.next();
		System.out.println("\n Now hold on, I will find the number of \"" + target + "\" repeatition in " + location + ".");
		NewTry.getWordCount();
	}
	
	public static String getLocation(){
		return location;
	}
	public static String getTarget(){
		return target;
	}

}
