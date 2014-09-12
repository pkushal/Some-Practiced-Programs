package Abstract;


public class Test {
	public static void main(String[] args) {
		Shape s= new Circle();
		s.draw();
		//s.umm();  not accessible
		
		//But we can do like
		Circle c = new Circle();
		c.draw();
		c.umm();
				
	}
}
