package com.Students;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentUtility {
	//1.Add Students.
	public static Student addStudent() {
	Scanner sc= new Scanner(System.in);
		Student s=new Student();
		System.out.println("enter the studentId");
		s.setsId(sc.nextInt());
		System.out.println("enter the StudentName");
		s.setsNmae(sc.next());
		System.out.println("enter the studentAge");
		s.setsAge(sc.nextInt());
		return s;
	}
	
	//2.update Student
	public static void updateStudent(List<Student>student) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the update student dteails");
		System.out.println("enter sId");
		int id=sc.nextInt();
		System.out.println("enter sName");
		String name=sc.next();
		System.out.println("enter sAge");
		int age=sc.nextInt();
		int count=0;
		for(Student s:student) {
			if(id ==s.getsId()) {
				break;
			}
			count++;
		}  
        student.get(count).setsNmae(name);
        student.get(count).setsAge(age);
//		return null;
	}
    //3.Display Student
	public static void displayAllStudent(List<Student>student) {
		Iterator<Student> studentIterator=student.iterator();
		while(studentIterator.hasNext()) {
			System.out.println(studentIterator.next().toString());
		}
	}
	//4.Delete Student
	public static void deletStudent(List<Student> student,int sId) {
		Iterator<Student> studentIterator=student.iterator();
		while(studentIterator.hasNext()) {
			Student s= studentIterator.next();
			if(s.getsId()==sId) {
				studentIterator.remove();
			}
		}
	}

	
}


