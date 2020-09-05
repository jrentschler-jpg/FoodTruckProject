package com.skilldistillery.foodproject;

public class FoodTruck {
	private static int uniqueNumTruckId = 12345;
	private int nextUniqueNumTruckId;
	private String name;
	private String type;
	private double rating;
	
	public FoodTruck() {
		
	}
	public FoodTruck(String name, String type, double rating) {
		this.name = name;
		this.type = type;
		this.rating = rating;
		
//		getters/setters
	}
	public int getNextUniqueNumTruckId() {
		return nextUniqueNumTruckId;
	}
	public void setNextUniqueNumTruckId() {
		this.nextUniqueNumTruckId = FoodTruck.uniqueNumTruckId++;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}

}
