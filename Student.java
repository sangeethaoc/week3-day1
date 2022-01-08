package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName(){
		System.out.println("Student Name : Sangeetha");
	}
	public void studentDept() {
		System.out.println("Student Department : Computer Science");
	}
	public void studentId(){
		System.out.println("Student ID : 5104605");
	}
	public static void main(String args[])
	{
		Student student = new Student();
		student.studentName();
		student.studentId();
		student.studentDept();
		student.deptName();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
	}
}
