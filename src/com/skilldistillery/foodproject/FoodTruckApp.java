package com.skilldistillery.foodproject;

import java.util.Scanner;

public class FoodTruckApp {
	private FoodTruck[] foodTruckArr = new FoodTruck[5];
	private FoodTruck bNewTruck;
	private int index = 0;

//	MAIN METHOD:
	public static void main(String[] args) {
		FoodTruckApp userInput = new FoodTruckApp();

		userInput.generate();
	}

//	METHOD 1: GENERATE USER OUTPUT
	private void generate() {
		int count = 0;
//		user story #1 - is prompted to input the name, food type, and rating for up to five food trucks.
		Scanner kb = new Scanner(System.in);
		String inputName = "";
		String inputType = "";
		double inputRating;

//		create food menu here FOR THE USER TO INPUT
		System.out.println("-----****-----***-----***-----***-----***-----***-----***-----");
		System.out.println("--------------------------------------------------------------");
		System.out.println("-----****---- THE {FOODIE FOOD TRUCK} APP -----****----");
		System.out.println("--------------------------------------------------------------");
		System.out.println("-----****-----***-----***-----***-----***-----***-----***-----");

		System.out.println();

		System.out.println("-----****-----***-----***-----***-----***-----***-----***-----");
		System.out.println("--------------------------------------------------------------");
		System.out.println("{} GO AHEAD AND RATE THE FIVE FOOD TRUCKS.");
		System.out.println("{} PLEASE PROVIDE THE NAME, FOOD TYPE, AND RATING (0-10 SCALE) FOR THE FIVE FOOD TRUCKS.");
		System.out.println("{} THE SCALE FOR THE RATING WILL BE DEFINED AS FOLLOWS: ");
		System.out.println("{} SCALE: 0  ---> THE LEAST FAVORITE THING YOU HAVE EVER ATE!");
		System.out.println("-------------------------TO---------------------------------");
		System.out.println("{} SCALE: 10 ---> THE BEST THING YOU HAVE EVER HAD!!!");
		System.out.println("--------------------------------------------------------------");
		System.out.println("-----****-----***-----***-----***-----***-----***-----***-----");

		System.out.println();

		System.out.println("-----****-----***-----***-----***-----***-----***-----***-----");
		System.out.println("--------------------------------------------------------------");
		System.out.println("{} IT WILL NOW ASK YOU FOR YOUR SELECTION.     ");
		System.out.println("{} **BEWARE: IF YOU HAVE LESS THAN THE FIVE ENTERIES, PLEASE WRITE 'Quit' TO PROCEED.**");
		System.out.println("--------------------------------------------------------------");
		System.out.println("-----****-----***-----***-----***-----***-----***-----***-----");

//		user story #2 If the user inputs quit for the food truck name, input ends immediately and the program continues.
//		user story #4 After choosing a menu item, the user sees the menu again and can choose another item until the choose to quit.
		while (count < 5) {
			System.out.println("Please Enter Food Truck's Name: ");
			inputName = kb.nextLine();

			if (inputName.equalsIgnoreCase("Quit")) {
				break;
			}
			System.out.println("Please Enter The Food You Like: ");
			inputType = kb.nextLine();

			if (inputType.equalsIgnoreCase("Quit")) {
				break;
			}
			System.out.println("Please Enter Food Truck's Rating (0-10 scale): ");
			inputRating = kb.nextDouble();
			kb.nextLine();

			bNewTruck = new FoodTruck();
			bNewTruck.setName(inputName);
			bNewTruck.setType(inputType);
			bNewTruck.setRating(inputRating);
			bNewTruck.setNextUniqueNumTruckId();
			additionalBNewTruck(bNewTruck);
			count++;
		}
//		kb.close();

		int select = 0;

		do {
//			user story #3
//			have the user input their entry selections here 

			System.out.println("-----****-----***-----***-----***-----***-----***-----***-----***-----***-----");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println();
			System.out.println("{} SELECT(1) OPTION: TO SEE THE LISTING OF ALL EXISTING FOOD TRUCKS. ");
			System.out.println("{} SELECT(2) OPTION: TO SEE THE 'AVERAGE RATING' OF THE FOOD TRUCKS. ");
			System.out.println("{} SELECT(3) OPTION: TO DISPLAY THE 'HIGHEST-RATED' FOOD TRUCKS. ");
			System.out.println("{} SELECT(4) OPTION: IF YOU ARE FINISHED, AND ARE READY TO QUIT THE PROGRAM. ");
			System.out.println();
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("-----****-----***-----***-----***-----***-----***-----***-----***-----***-----");

			select = kb.nextInt();
//			select 1: List all existing food trucks.
			if (select == 1) {
				printfoodTruckArr(getNewTrucks());
			}
//			select 2: See the average rating of food trucks.
			if (select == 2) {
				getAverage(getNewTrucks());
			}
//			select 3: Display the highest-rated food truck.
			if (select == 3) {
				getHighest(getNewTrucks());
//				getName(), getType()
			}
//			select 4: Quit the program.
		} while (select != 4);
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("-----****-----***-----***-----***-----***-----***-----***-----***-----***-----");
		System.out.println("THANK YOU FOR INPUTING YOUR FOOD TRUCKS AND GIVING THEM AWESOME RATINGS!");
		System.out.println(" DON'T FORGET: KEEP ON {FOODIE FOOD TRUCKIN!} ");
		System.out.println("-----****-----***-----***-----***-----***-----***-----***-----***-----***-----");
		System.out.println("------------------------------------------------------------------------------");

	}

	private void additionalBNewTruck(FoodTruck brandNewTruck2) {
		foodTruckArr[index] = brandNewTruck2;
		index++;

	}

	private FoodTruck[] getNewTrucks() {
		FoodTruck[] copyTrucks = new FoodTruck[index];

		for (int i = 0; i < copyTrucks.length; i++) {
			copyTrucks[i] = foodTruckArr[i];

		}
		return copyTrucks;
	}

	private void getAverage(FoodTruck[] brandNewTruck) {
		double average = 0;
		double sum = 0;
		for (FoodTruck bNewTruck : brandNewTruck) {
			double ratings = bNewTruck.getRating();
			sum = sum + ratings;
		}
		average = (sum / brandNewTruck.length);
		System.out.println("The 'Average Rating' For The List Of Food Trucks is:  " + average);

	}

	private void printfoodTruckArr(FoodTruck[] brandNewTruck) {
		for (FoodTruck bNewTruck : brandNewTruck) {
			bNewTruck.displaybrandNewTruck();
		}
	}

	private void getHighest(FoodTruck[] brandNewTrucks) {
		double highest = 0;
		int indexOfHighestRating = 0;

		for (int i = 0; i < brandNewTrucks.length; i++) {
			double ratings = brandNewTrucks[i].getRating();

			if (highest < ratings) {
				highest = ratings;
				indexOfHighestRating = i;
			}

		}

		System.out.println("-----***-----***-----***-----***-----***-----***-----***------");
		System.out.println("--------------------------------------------------------------");
		System.out.println("THE HIGHEST RATED FOOD TRUCK IS: ");
		System.out.println(brandNewTrucks[indexOfHighestRating].toString());
		System.out.println("--------------------------------------------------------------");
		System.out.println("-----***-----***-----***-----***-----***-----***-----***------");
		

	}
}
