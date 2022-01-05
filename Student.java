package week3.Day1;

//Methods   :studentName(),studentDept(),studentId()

//Assignment2:
//=============
//     Package   :org.college
//     Class     :College
//     Methods   :collegeName(),collegeCode(),collegeRank()
//
//     Package   :org.department
//     Class        :Department
//     Methods   :deptName()
// 
//     Package   :org.student
//     Class        :Student
//     Methods   :studentName(),studentDept(),studentId()
//  
//Description:
//create above 3 class and call all your class methods into the Student using multilevel inheritance.

public class Student extends Department{
	public void studentName() {
		String name = "Sasi";
		String dept1 = "Economics";
		int id = 12345678;
		System.out.println("Student name is "+name);
		System.out.println("Student department is "+dept1);
		System.out.println("Student id is "+id);
	}

	public static void main(String[] args) {
		Student details = new Student();
		details.studentName();
		details.deptName();
		details.collegeName();		
		
	}

}
