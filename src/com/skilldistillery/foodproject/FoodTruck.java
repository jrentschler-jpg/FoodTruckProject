package com.skilldistillery.foodproject;

public class FoodTruck {
//	INITIALIZING THE CLASS DATATYPES 
	private static int uniqueNumTruckId = 12345;
	private int nextUniqueNumTruckId;
	private String name;
	private String type;
	private double rating;
	
//	default ctor(constructor)
	public FoodTruck() {

	}
//	Methods ctor (constructors)
	public FoodTruck(int nextUniqueNumTruckId, String name, String type, double rating) {
		this.nextUniqueNumTruckId = FoodTruck.uniqueNumTruckId++;
		this.name = name;
		this.type = type;
		this.rating = rating;
	}

//		getter: 
	public int getNextUniqueNumTruckId() {
		return nextUniqueNumTruckId;
	}
//		setter:
	public void setNextUniqueNumTruckId() {
		this.nextUniqueNumTruckId = FoodTruck.uniqueNumTruckId++;
	}

//		getter: 
	public String getName() {
		return name;
	}

//		setter:
	public void setName(String name) {
		this.name = name;
	}

//		getter: 
	public String getType() {
		return type;
	}

//		setter:
	public void setType(String type) {
		this.type = type;
	}

//		getter: 
	public double getRating() {
		return rating;
	}

//		setter:
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
	@Override
	public String toString() {
		
		return "FoodTruck [nextUniqueNumTruckId=" + nextUniqueNumTruckId + ", name=" + name + ", type=" + type
				+ ", rating=" + rating + "]";
	}
	public void displaybrandNewTruck() {
		String FoodTruck = this.toString();
		System.out.println(FoodTruck);
		
	}
	
}
