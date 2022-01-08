package week3.day1;

public class Students {
	

	public void getStudentInfo(int studentID)
	{
		System.out.println("Getting student details for the given Student ID");
	}
	public void getStudentInfo(int studentID, String studentName)
	{
		System.out.println("Getting student details for the given Student ID and Student Name");
	}
	public void getStudentInfo(String email, long phoneNumber)
	{
		System.out.println("Getting student details for the given Student Email and Phone Number");
	}

	public static void main(String[] args) {
		
		//Creating object for the class
		Students students = new Students();
		
		System.out.println("Calling overloaded methods with different parameters");
		students.getStudentInfo(51034);
		students.getStudentInfo(51034, "Sangeetha");
		students.getStudentInfo("sangeethaoc@gmail.com", 9190523265l);
	}

}
