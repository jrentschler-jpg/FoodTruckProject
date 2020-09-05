package com.skilldistillery.foodproject;

import java.util.Scanner;

public class FoodTruckApp {
	private FoodTruck[] foodTruckArr = new FoodTruck[5];
	private FoodTruck bNewTruck;
	private int index =0;
	
//	MAIN METHOD:
	public static void main(String[] args) {
		FoodTruckApp userInput = new FoodTruckApp();
		
		
		
		
		
		
		userInput.generate();
	}
//	METHOD 1: GENERATE USER OUTPUT
	private void generate() {
		int count = 0;
//		user story #1
		Scanner kb = new Scanner(System.in);
		String inputName = "";
		String inputType = "";
		double inputRating;
		
//		create food menu here FOR THE USER TO INPUT
		System.out.println("--------------------------------------------------------------");
		System.out.println("WELCOME, TO THE FOOD TRUCK APP :");
		System.out.println("--------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------");
		System.out.println("{} GO AHEAD AND RATE THE FIVE FOOD TRUCKS.");
		System.out.println("{} PLEASE PROVIDE THE NAME, FOOD TYPE, AND RATING (0-10 SCALE) FOR THE FIVE FOOD TRUCKS.");
		System.out.println("{} THE SCALE FOR THE RATING WILL BE DEFINED AS FOLLOWS: ");
		System.out.println("{} SCALE: 0  ---> THE LEAST FAVORITE THING YOU HAVE EVER ATE!");
		System.out.println("-------------------------TO---------------------------------");
		System.out.println("{} SCALE: 10 ---> THE BEST THING YOU HAVE EVER HAD!!!");
		
		
		
		
//		user story #2
		while (count < 5) {
			bNewTruck = new FoodTruck();
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
			
			bNewTruck.setName (inputName);
			bNewTruck.setType (inputType);
			bNewTruck.setRating (inputRating);
			bNewTruck.setNextUniqueNumTruckId ();
			additionalBNewTruck(bNewTruck);
			count ++;
			
		
		int select = 0;
		
		do {
			user story #3
			have the user input their enteries here 
			System.out.println("------------------------------------");
			System.out.println("------------------------------------");
			System.out.println("------------------------------------");
			
			
			
			select = kb.nextInt();
			
//		sysout lines closing the menu selection
		
		
		}
		private void additionalBNewTruck(FoodTruck brandNewTruck2) {
		foodTruckArr[index] = brandNewTruck2;
		index++;
		
	}
		private FoodTruck[] getNewTrucks () {
			FoodTruck[] copyTrucks = new FoodTruck[index];
			
			for (int i = 0; i < copyTrucks.length; i++) {
				copyTrucks[i] = foodTruckArr[i];
				
			}
			return copyTrucks;
		}
			private void getAverage(FoodTruck[] brandNewTruck) {
				double average = 0;
				double sum =0 ;
				
			}
			private void printfoodTruck(FoodTruck[] brandNewtTruck) {
				for (FoodTruck truck : bNewTruck) {
					bNewTruck.displayBNewTruck();
				}
				
			private void getHighest(FoodTruck[] brandNewTruck) {
				double highest = 0;
				int uniqueTruckId = 0;
				String truckName = "";
				String truckType = "";
				for (int i = 0; i < brandNewTruck.length; i++) {
					double ratings = bNewTruck.getRating();
				}
				if (ratings > highest) {
					ratings = highest;
					
				}
				System.out.println("--------------------------------------------------------------");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
					
				
				}
	}

