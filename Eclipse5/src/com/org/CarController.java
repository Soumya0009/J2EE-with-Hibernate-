package com.org;

import java.util.Scanner;

public class CarController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		CarDTO carDTO =  new CarDTO();
		System.out.println("Enter Car ID");
		carDTO.id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Car Name");
		carDTO.cname = scanner.nextLine();
		System.out.println("Enter car Price");
		carDTO.price = scanner.nextDouble();
		CarCrud.saveCar(carDTO);
		System.out.println(carDTO.id);
		System.out.println(carDTO.cname);
		System.out.println(carDTO.price);
	}

}
