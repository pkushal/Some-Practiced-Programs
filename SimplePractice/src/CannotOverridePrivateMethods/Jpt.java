package CannotOverridePrivateMethods;

public class Jpt {
	public void fnc() {
		System.out.println("wala");
	}

	private void fncc() {
		System.out.println("walaaaaaa");
	}

	public static void main(String[] args) {
		Jpt j = new Jpt();
		j.fnc();
		j.fncc();
	}
}
