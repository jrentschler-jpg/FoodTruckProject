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
		
		Scanner kb = new Scanner(System.in);
		String inputName = "";
		String inputType = "";
		double inputRating;
	}
}
