package com.org.Student;

import java.util.Scanner;

public class Student_Controller {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("(1) SAVE STUDENT DATA");
		System.out.println("(2) DISPLAY STUDENT DATA");
		System.out.println("(3) UPDATE STUDENT DATA");
		System.out.println("(4) DELETE STUDENT DATA");
		System.out.print("ENTER YOUR CHOICE: ");
		int ch = scanner.nextInt();
		switch (ch) {
		case 1: {

			System.out.print("Enter Student Roll Number: ");
			int roll = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Enter Student Name: ");
			String name = scanner.nextLine();

			System.out.print("Enter Student Age: ");
			int age = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Enter Student Email: ");
			String email = scanner.next();

			System.out.print("Enter Student Gender: ");
			String gender = scanner.next();

			boolean resBoolean = StudentCRUD.saveStudent(roll, name, age, email, gender);

			if (resBoolean) {
				System.out.println("Data inserted sucessfully");
			} else {
				System.out.println("Something Went Wrong!!!");
			}

		}
			break;
		case 2: {
			StudentCRUD.displayStudentDetails();
		}
			break;
		case 3: {
			System.out.println("Enter Student Roll No: ");
			int id = scanner.nextInt();
			System.out.println("(a) To update name");
			System.out.println("(b) To update age");
			System.out.println("(c) To update email");
			System.out.println("(d) To update all");
			System.out.print("Enter Your choice: ");
			char choic = scanner.next().charAt(0);

			switch (choic) {
			case 'a': {
				System.out.print("Enter new name: ");
				String name = scanner.next();
				if (StudentCRUD.updateStudent(id, name)) {
					System.out.println("Name updated successfully");
				} else {
					System.out.println("Failed to update name");
				}
			}
				break;
			case 'b': {
				System.out.print("Enter new age: ");
				int age = scanner.nextInt();
				if (StudentCRUD.updateStudent1(id, age)) {
					System.out.println("Age updated successfully");
				} else {
					System.out.println("Failed to update age");
				}
			}
				break;
			case 'c': {
				System.out.print("Enter new email: ");
				String email = scanner.next();
				if (StudentCRUD.updateStudent2(id, email)) {
					System.out.println("Email updated successfully");
				} else {
					System.out.println("Failed to update email");
				}
			}
				break;

			case 'd': {
				scanner.nextLine();
				System.out.print("Enter new name: ");
				String name = scanner.nextLine();
				System.out.print("Enter new age: ");
				int age = scanner.nextInt();
				System.out.print("Enter new email: ");
				String email = scanner.next();
				System.out.print("Enter gender: ");
				String gender = scanner.next();
				if (StudentCRUD.updateStudent3(id, name, age, email,gender)) {
					System.out.println("Data update sucessfully");
				} else {
					System.out.println("Failed to Update data");
				}
			}
				break;
				
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
			break;
		case 4: {
			System.out.println("Enter the student roll no: ");
			int roll = scanner.nextInt();
			int res = StudentCRUD.deleteStudentData(roll);
			if (res == 0) {
				System.out.println("There is no data available the spacified Roll Number");
			} else {
				System.out.println("Data was deleted");
			}

		}
			break;

		default:
			System.out.println("Unexpected value: " + ch);
		}
	}
}
