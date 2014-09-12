import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {
	private static int[] A = { 3, 2, 60, 14, 7, 52, 27, 49 };
	private static int[] B = { 10, 27, 30, 1, 6, 14, 12, 2 };
	private static ArrayList<Integer> intersection = new ArrayList<Integer>();

	public static void main(String[] args) {
		display(findIntersection(A, B));
	}

	public static ArrayList<Integer> findIntersection(int[] A, int[] B) {
		Arrays.sort(A);
		Arrays.sort(B);
		displayArr(A);
		displayArr(B);
		int pointerA = 0;
		int pointerB = 0;
		int length_Array = A.length; // Assumption that both arrays are of same
										// length

		while (pointerA < length_Array && pointerB < length_Array) {

			if (A[pointerA] == B[pointerB]) {
				intersection.add(A[pointerA]);
				pointerA++;
				pointerB++;
			} else if (A[pointerA] < B[pointerB]) {
				pointerA++;
			} else {
				pointerB++;
			}
		}
		return intersection;
	}

	public static void display(ArrayList<Integer> input) {
		if (input.size() == 0) {
			System.out.println("No common elements found ....");
		} else {
			System.out
					.print("The intersection of elements from the above two sets are : ");
			for (int i = 0; i < input.size(); i++) {
				System.out.print("\t " + input.get(i));
			}
		}
	}

	public static void displayArr(int[] input) {

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + "\t ");
		}
		System.out.println("\n");

	}
}
