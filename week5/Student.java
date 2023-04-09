package week5;

public class Student {
	
	//number of students
	static int numberOfStudents;
	
	//student properties
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int grade;
	
	public Student() {}
	
	public Student(String firstName, String lastName)	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Student(String firstName, String lastName, String phoneNumber, int grade)	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.grade = grade;
	}
	
	public void introduce() {
		System.out.println("Hello, my name is " + firstName + " " + lastName);
		System.out.println("I am in grade " + grade);
		System.out.println("My phone number is " + phoneNumber);
	}
	
	/*
	 * private methods
	 */
	private boolean checkLength(String str, int length)	{
		return str.length()	> length; 
	}
	
	
	
	/*
	 * Getters and Setters
	 */
	
	public void setFirstName(String firstName)	{
		if (checkLength(firstName, 1))	{
			this.firstName = firstName;
		}
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName)	{
		if (checkLength(lastName, 1))	{
			this.lastName = lastName;
		}
	}
	
	public void setPhoneNumber(String phoneNumber)	{
		if (checkLength(phoneNumber, 9))	{
			this.phoneNumber = phoneNumber;
		}
		
	}
	
	public String getPhoneNumber()	{
		return phoneNumber;
	}
	
	public void setGradeLevel(int gradeLevel)	{
		if (grade > 0 && grade < 13)	{
			this.grade = grade;
		}
		
		
	}
	
	public int getGrade()	{
		return grade;
	}
}
