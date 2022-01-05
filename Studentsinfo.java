package week3.Day1;

//Assignment 4:
//==============
//
//      Class: Students
//      Methods: getStudentInfo()
//
//Description: 
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber

public class Studentsinfo {

	public void getstudentsinfo() {
		// Create students info

		//int studentId = 25810;
		//String stundentName = "xxxxxx";
		// String emailId = "sasixxxx@gmail.com";
		// float phoneNo= 1234567891;
	}
	public void getstudentsinfo(int studentId, String stundentName) {
		System.out.println("Overload method1");
		System.out.println("Student Id and Name is"+studentId+stundentName);
	}
	public void getstudentsinfo(String emailId,float phoneNo) {
		System.out.println("Overload method2");
		System.out.println("Student Email Id & PhoneNumber is"+emailId+phoneNo);
	}


	public static void main(String[] args) {

		Studentsinfo stu = new Studentsinfo();
 		stu.getstudentsinfo("xxxxx@gmail.com",1234567891);
 		stu.getstudentsinfo(123552, "xxx");

	}

}
