package org.student;
import org.college.College;
import org.department.Department;

public class Student extends Department {
	public void studentName()
	{
	System.out.println("student name is kiruthiga");	
	}
	public void studentDepartment() 
	{
	System.out.println("Student Department is CSE");	
	}
	public void studentId() 
	{
	System.out.println("stident id is 1456789");	
	}

	public static void main(String[] args) {
		College collg =new College();
		collg.collegeCode();
		collg.collegeName();
		collg.collegeRank();
		Department mydept=new Department();
		mydept.deptName();
		Student stud=new Student();
		stud.studentName();
		stud.studentDepartment();
		stud.studentId();
	}
	}


