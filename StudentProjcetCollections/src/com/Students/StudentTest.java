package com.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Student>studentlist=new ArrayList<Student>();
	while(true) {
		System.out.println("\tStudent project management");
		System.out.println("===============================================");
		System.out.println("1.Add Student");
		System.out.println("2.Update Student");
		System.out.println("3.Display All Student");
		System.out.println("4.Delete Student");
		System.out.println("Select one option: ");
		int option=sc.nextInt();
		//Switch for choicesing options
		switch(option) {
		//Add Student
		case 1:
			Student student=StudentUtility.addStudent();
			studentlist.add(student);
			System.out.println("Student addes succesfully");
			break;
		//Update Student
        case 2:
			StudentUtility.updateStudent(studentlist);
			break;
        //Display All Student
        case 3:
        	StudentUtility.displayAllStudent(studentlist);
		    break;
        //Delete Student
        case 4:
	       System.out.println("Delet the student details");
	       System.out.println("Enter StudentId:");
           int sId=sc.nextInt();
           StudentUtility.deletStudent(studentlist, sId);
           System.out.println("delete succesfully :");
           break;
         default:{
	         System.err.println("choices the correct option");
          }
		}
	}

	}

}
