import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NewTry {
	static Scanner in;
	static String match = WordCountMain.getTarget();
	static int count = 0;
	static int total = 0;
	public static void getWordCount() {

		File file = new File(WordCountMain.getLocation());
		System.out.println("I found your file address here too..."
				+ WordCountMain.getLocation());

		try {
			in = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (in.hasNextLine()) {

			String uff = in.nextLine();
			System.out.println(uff);
			String line = uff;
			String[] sentence = line.split(" ");
			int count = 0;
			for (String word : sentence) {
				if (word.equals(match)) {
					count += 1;
				}
			}
			System.out.println("Total of " + count + " "+ WordCountMain.getTarget() +" found in the line above !!!");
			total = total + count;
		}
System.out.println("Grand total : " + total);
	}
}
