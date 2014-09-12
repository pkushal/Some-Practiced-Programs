package StaticMethods;

public class SubClass extends SuperClass {

	// overriding the static method
	// cannot override the super class static method just like the super class
	// private methods
//	public final void thisisfinal(){
//		System.out.println("this is final from the subclass");
//	}
	
	/// CANNOT OVERRIDE THE FINAL METHOD
	
	public static void staticMethod() {
		System.out.println("SubClass:  staticMethod");
	}

	public static void main(String[] args) {

		SuperClass A = new SuperClass();
		SubClass C = new SubClass();
		A.staticMethod();
		A.thisisfinal();
		C.staticMethod();
		C.thisisfinal();
		C.haha();
		SuperClass B = new SubClass();
		System.out.println();

		B.staticMethod();// B bhanne reference ta SuperClass ko ho but pointing
							// to the SubClass object and B cannot access the
							// SubClass's staticMethod
		// Object point chai SubClass ko gare pani ... B lai access chai
		// SuperClass ko matra cha
		// Reference is important
		B.thisisfinal();
	}

}