package CannotOverridePrivateMethods;

public class Base {

	public void func(){
		System.out.println("public method from base class");
	}
	

	private void pri(){
		System.out.println("private method from the base class");
	}
	Base b = new Base();
	
	
}
