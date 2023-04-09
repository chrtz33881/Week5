package week5;

public class Week5Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder name = new StringBuilder();
		StringBuilder name2 = new StringBuilder();
		
		Student student1 = new Student();
		student1.setFirstName("Tom");
//		student1.lastName = "Hardy";
//		student1.grade = 12; 
//		student1.phoneNumber = "4893849485";
		
		student1.introduce();
		
		Student student2 = new Student("Sammy", "Jones");
		student2.introduce();
		
		Student student3 = new Student("Tom", "Riddle", "4858549589", 11);
		student3.introduce();

	}

}
