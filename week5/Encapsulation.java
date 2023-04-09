package week5;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.setFirstName("Sally");
		student.setPhoneNumber("2349495945");
		System.out.println(student.getFirstName());
		student.introduce();
		
		
		// RECTANGLE SAMPLE
		Rectangle rec = new Rectangle (10.0, 15.0);
		rec.setLength(10.0);
		System.out.println(rec.getArea());
		
		/*
		 * Access Modifiers:
		 * 
		 * public - accessible everywhere
		 * 
		 * private - Only accessible from the class itself
		 * 
		 * protected - accessible within the class, other classes in the same package, and all subclasses
		 * 
		 * No Modifier - Same as protected, except not accessible in a subclass in different packages
		 * 
		 * 
		 */

	}

}
