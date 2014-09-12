import java.util.ArrayList;

public class Maths {

	public static void main(String[] args) {

		compute("24+16-5*10/2");
	}

	public static void compute(String input) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<Integer> ope = new ArrayList<Integer>();

		int len = input.length();
		StringBuffer so = new StringBuffer();
		int locator = 0;

		for (int i = 0; i < len; i++) {

			char c = input.charAt(i);

			if (Character.isDigit(c)) {
				so = so.append(input.charAt(i));

			} else {
				String kpp = so.toString();
				num.add(Integer.parseInt(kpp));
				so.delete(0, so.length());

				switch (c) {
				case '*':
					ope.add(1, locator);
					break;
				case '-':
					ope.add(3, locator);
					break;
				case '/':
					ope.add(0, locator);
					break;
				case '+':
					ope.add(2, locator);
					break;
				}
				locator++;
			}

		}
		String kpp = so.toString();
		num.add(Integer.parseInt(kpp));

		for (int j = 0; j < num.size(); j++) {
			System.out.println(num.get(j));
		}
		for (int m = 0; m < ope.size(); m++) {
			System.out.println("Locator : " +ope.get(m));
		}

	}
}
