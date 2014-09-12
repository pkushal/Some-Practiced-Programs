package Overriding;

public class TestDog {

	public static void main(String args[]) {
		Animal a = new Animal(); // Animal reference and object
		Animal b = new Dog(); // Animal reference but Dog object
		Dog d = new Dog();
		a.move();// runs the method in Animal class

		b.move();// Runs the method in Dog class
		d.bark();
		// Cannot access "b.bark" because b has a reference of type animal even
		// though it is pointing to the Dog object which supports bark method
	
	}
}
