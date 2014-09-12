package CannotOverridePrivateMethods;

public class Demo{
	public static void main(String[] args) {
		Derived d = new Derived();
		d.func();
		System.out.println();
		d.pri();
		Base b = new Base();
		b.func();
	
	}
}