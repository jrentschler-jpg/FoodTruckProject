package com.skilldistillery.foodproject;

import java.util.Scanner;

public class FoodTruckApp {
	private FoodTruck[] foodTruck = new FoodTruck[5];
	private FoodTruck brandNewTruck;
	private int index =0;

	public static void main(String[] args) {
		FoodTruckApp userInput = new FoodTruckApp();
		
		userInput.generate();
	}
	private void generate() {
		int count = 0;
//		user story #1
		Scanner kb = new Scanner(System.in);
		String inputName = "";
		String inputType = "";
		double inputRating;
		
		System.out.println("-------------------------");
//		create food menu here 
		
		
		
//		user story #2
		while (count < 5) {
			brandNewTruck = new FoodTruck();
			System.out.println("Please Enter Truck's Name: ");
			inputName = kb.nextLine();
			
			if(inputName.equalsIgnoreCase("Quit")) {
				break;
			}
			System.out.println("Please Enter Food You Like: ");
			inputType = kb.nextLine();
			
			if(inputType.equalsIgnoreCase("Quit")) {
				break;
			}
			System.out.println("Please Enter Truck's Rating: ");
			inputRating = kb.nextDouble();
//			kb.nextLine();
			
			brandNewTruck.setName (inputName);
			brandNewTruck.setType (inputType);
			brandNewTruck.setRating (inputRating);
			brand.NewTruck.setnextUniqueNumTruckId ();
			additionalBrandNewTruck(brandNewTruck);
			count ++;
			
		}
		
		
		
	}
}
