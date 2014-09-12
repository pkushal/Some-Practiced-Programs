//IN JAVA 
//finding the string within the given parenthesis without using variables
public class Parenthesis {
	public static void main(String[] args) {
		System.out.println(parenthesis("k(us)hal"));
		System.out.println(findParenthesis("(ks)l"));
	}

	public static String parenthesis(String input) {

		if (!Character.toString(input.charAt(0)).equals("(")) {

			return parenthesis(input.substring(1));
		} else if (!Character.toString(input.charAt(input.length() - 1))
				.equals(")")) {

			return parenthesis(input.substring(0, input.length() - 1));
		} else {
			return input;
		}

	}
	
	
	//this is from career cup solution
	//note the difference between "" and '' while comparing the individual characters
	public static String findParenthesis(String s) {
		if(s.charAt(0) == '(') {
			if(s.charAt(s.length()-1) == ')')
				return s;
			else return findParenthesis(s.substring(0, s.length()-1));
		} else {
			return findParenthesis(s.substring(1));
		}
	}
}
