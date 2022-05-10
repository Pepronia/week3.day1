package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName()
	{
		System.out.println("Student name is AR");
	}
	public void studentDept()
	{
		System.out.println("Student dept is IT");
	}
	public void studentId()
	{
		System.out.println("Student ID is 123");
	}
	public static void main(String[] args) {
		
		Student s = new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		s.deptName();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
	
		
	}
}
