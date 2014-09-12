package CannotOverridePrivateMethods;

class Derived extends Base {
	
	public void pri() { // nope nope I am not overriding the private method from
						// the Base class...I am just defining a method called
						// pri() in the Derived class....it has no relation to
						// the method in the super class
		System.out.println("private class overridden from the derived class");
	}
	
}
