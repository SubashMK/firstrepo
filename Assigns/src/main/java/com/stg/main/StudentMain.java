/**
 * 
 */
package com.stg.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.stg.model.Address;
import com.stg.model.Class;
import com.stg.model.Student;
import com.stg.service.StudentService;
import com.stg.service.StudentServiceImpl;

/**
 * @author training
 *
 */
public class StudentMain {

	public static void main(String[] args) {
		
		List<Address> addresses = new ArrayList<Address>();
		Address add1 = new Address(123,"chennai","T.N",600056);
		addresses.add(add1);
		List<Class> classes = new ArrayList<Class>();
		Class newclass1 = new Class ("Science",'A',"Computer Science");
		Scanner input = new Scanner(System.in);
		StudentService studentProcess = new StudentServiceImpl();

		try {
//			System.out.println("Enter Student Id : ");
//			int studId = input.nextInt();

			System.out.println("Enter Student Name : ");
			String studName = input.next();

			Student student = new Student(1234, "subash", 22, "male", 89.25f, addresses, null);
//			student = studentProcess.createStudent(student);
//			System.out.println("Created successfully");
			
			
			studentProcess.readByStudName(student, studName);
			System.out.println("Student present");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		
	}

}
