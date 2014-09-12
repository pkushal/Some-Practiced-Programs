package Array;

public class ArrayRotation {
	static int[] val = { 3, 4, 5, 6, 7, 8, 9, 0, 1, 2 };

	public static void main(String[] args) {
		System.out.println("The given array is: ");
		display();
		rotate();
		System.out.println("The array after the rotation of 2 is: ");
		// display();
	}

	public static void rotate() {
		int shift = 3;
		for (int i = 0; i < shift; i++) {
			int[] visited = new int[val.length];
			int pos = i + shift;
			int temp = val[i];
			int start = i;
			do {
				if (visited[pos] == -1) {
					continue;
				} else {
					int swap = val[pos];
					val[pos] = temp;
					temp = swap;
					visited[pos] = -1;
					pos = (pos + shift) % (val.length);
				}
			} while (pos != start + shift);
			display();
		}
	}

	public static void display() {
		for (int i = 0; i < val.length; i++) {
			System.out.print(val[i] + "\t");
		}
		System.out
				.println("\n----------------------------------------------------------");
	}
}
