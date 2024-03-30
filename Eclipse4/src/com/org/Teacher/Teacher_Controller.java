package com.org.Teacher;

import java.util.Scanner;

public class Teacher_Controller {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("(1) SAVE TEACHER DATA");
		System.out.println("(2) DISPLAY TEACHER DATA");
		System.out.println("(3) UPDATE TEACHER DATA");
		System.out.println("(4) DELETE TEACHER DATA");
		System.out.println("ENTER YOUR CHOICE: ");
		int ch = scanner.nextInt();
		switch (ch) {
		case 1: {
			
			System.out.print("Enter Teacher Id: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("Enter Teacher Name: ");
			String name = scanner.nextLine();
			
			System.out.print("Enter Teacher Department: ");
			String department = scanner.nextLine();
			
			System.out.print("Enter Teacher Email: ");
			String email = scanner.next();
			
			System.out.print("Enter Student Gender: ");
			String gender = scanner.next();
			
			System.out.print("Enter Teacher Salery: ");
			int salery = scanner.nextInt();
			
			boolean resBoolean = TeacherCRUD.saveTeacher(id, name, department, email, gender, salery);
			
			if (resBoolean) {
				System.out.println("Data inserted sucessfully");
			} else {
				System.out.println("Something Went Wrong!!!");
			}
			
		}
		break;
		
		default:
			System.out.println("Unexpected value: " + ch);
		}
	}

}
