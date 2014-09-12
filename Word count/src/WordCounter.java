import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
	static Scanner in;
	static String match = WordCountMain.getTarget();

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
		for (int k = 0; k < 4; k++) {
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
			System.out.println("Total of " + count + " found.");
		}

	}
}
