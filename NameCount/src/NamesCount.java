/* HashMap use garna sikeko*/

import java.util.HashMap;

public class NamesCount {
	private static  int count= 0;
	private static HashMap<String, Integer> counts = new HashMap<String, Integer>();
	
	/**
	 * Adds the name.
	 * @param name Name.
	 */
	public void addName(String name) {
		Integer nameCount = counts.get(name);

		if (nameCount == null) {
			nameCount = 1;
			counts.put(name, nameCount);
		}
        else{
		nameCount++;
		counts.put(name, nameCount);
		}
		count++;
        }
	

	
	public double nameProportion(String name) {
		double kpp = counts.get(name);
		double so = kpp/count;
		return so;
	}


	public static void main(String[] args) {
		NamesCount namesCount = new NamesCount();

		namesCount.addName("John");
		namesCount.addName("Mary");
		namesCount.addName("Mary");
		namesCount.addName("Kushal");
		namesCount.addName("Rabindar");
		
		System.out.println("John ko get garekko" + counts.get("John"));
		System.out.println("Mary ko get garekko" + counts.get("Mary"));
		System.out.println("Kushal ko get garekko"+ counts.get("Kushal"));
		
		System.out.println("Total count: "+ count);
		System.out.println("~~~~~~~~~Calm Down~~~~~~~~~~~");
		System.out.println("Fraction of Johns: " + namesCount.nameProportion("John"));
		System.out.println("Fraction of Marys: " + namesCount.nameProportion("Mary"));
		System.out.println("Fraction of Kushal: " + namesCount.nameProportion("Kushal"));
	}
}