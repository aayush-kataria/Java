package com.question5;

import java.util.Scanner;

class Vehicle{
	private int noOfWheels;
	private int noOfPassengers;
	private int model;
	private String make;
	
	public Vehicle(int noOfWheels, int noOfPassengers, int model, String make) {
		this.noOfWheels = noOfWheels;
		this.noOfPassengers = noOfPassengers;
		this.model = model;
		this.make = make;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public void displayVehicle() {
		System.out.println("NO of Wheels : " + this.noOfWheels + " No of Passengers : " + this.noOfPassengers + " Model : " + this.model + " Make : " + this.make);
	}
}

class Car extends Vehicle{
	private int noOfDoors;
	
	public Car(int noOfWheels, int noOfPassengers, int model, String make, int noOfDoors){
		super(noOfWheels, noOfPassengers, model, make);
		this.noOfDoors = noOfDoors;
	}
	
	public void displayCar() {
		System.out.println("Make : " + super.getMake() + " Model : " + super.getModel() + " No of Doors : " + this.noOfDoors);
	}
}

class Convertible extends Car{
	
	private boolean isHoodOpen;
	
	public Convertible(int noOfWheels, int noOfPassengers, int model, String make, int noOfDoors, boolean isHoodOpen){
		super(noOfWheels, noOfPassengers, model, make, noOfDoors);
		this.isHoodOpen = isHoodOpen;
	}
	
	public void display() {
		System.out.println("NO of Wheels : " + super.getNoOfWheels() + " No of Passengers : " + super.getNoOfPassengers() + " Model : " + super.getModel() + " Make : " + super.getMake() + " Is Hood Open : " + this.isHoodOpen);
	}
}

class SportCar extends Car{
	
	public SportCar(int noOfWheels, int noOfPassengers, int model, String make, int noOfDoors){
		super(noOfWheels, noOfPassengers, model, make, 2);
	}
	
	public void displaySportCar() {
		super.displayCar();
	}
	
}

public class Overriding {

	public static void main(String[] args) {
		int option;
		Scanner scanner = new Scanner(System.in);
		int noOfWheels, noOfPassengers, model, noOfDoors;
		String make;
		boolean isHoodOpen;
		System.out.println("Enter 1 to create a Vehicle Object");
		System.out.println("Enter 2 to create a Car Object");
		System.out.println("Enter 3 to create a Convertible Object");
		System.out.println("Enter 4 to create a SportCar Object");
		option = scanner.nextInt();
		
		switch(option) {
		case 1: 
			//data for creating object of vehicle class
			System.out.println("Enter no. of wheels");
			noOfWheels = scanner.nextInt();
			System.out.println("Enter no. of passengers");
			noOfPassengers = scanner.nextInt();
			System.out.println("Enter model number");
			model = scanner.nextInt();
			System.out.println("Enter the make");
			make = scanner.nextLine();
			//object of vehicle 
			Vehicle vehicle = new Vehicle(noOfWheels, noOfPassengers, model, make);
			vehicle.displayVehicle();
			break;
			
		case 2 :
			//data for creating object of Car class
			System.out.println("Enter no. of wheels");
			noOfWheels = scanner.nextInt();
			System.out.println("Enter no. of passengers");
			noOfPassengers = scanner.nextInt();
			System.out.println("Enter model number");
			model = scanner.nextInt();
			System.out.println("Enter the make");
			make = scanner.nextLine();
			System.out.println("Enter no. of doors");
			noOfDoors = scanner.nextInt();
			//object of vehicle 
			Car car = new Car(noOfWheels, noOfPassengers, model, make, noOfDoors);
			car.displayCar();
			break;
			
		case 3 :
			//data for creating object of Convertible class
			System.out.println("Enter no. of wheels");
			noOfWheels = scanner.nextInt();
			System.out.println("Enter no. of passengers");
			noOfPassengers = scanner.nextInt();
			System.out.println("Enter model number");
			model = scanner.nextInt();
			System.out.println("Enter the make");
			make = scanner.nextLine();
			System.out.println("Enter no. of doors");
			noOfDoors = scanner.nextInt();
			System.out.println("Enter true if you want Hood Open and false if you want hood closed");
			isHoodOpen = scanner.nextBoolean();
			//object of vehicle 
			Convertible convertible = new Convertible(noOfWheels, noOfPassengers, model, make, noOfDoors, isHoodOpen);
			convertible.display();
			break;
			
		case 4 :
			//data for creating object of Car class
			System.out.println("Enter no. of wheels");
			noOfWheels = scanner.nextInt();
			System.out.println("Enter no. of passengers");
			noOfPassengers = scanner.nextInt();
			System.out.println("Enter model number");
			model = scanner.nextInt();
			System.out.println("Enter the make");
			make = scanner.nextLine();
			System.out.println("Enter no. of doors");
			noOfDoors = scanner.nextInt();
			//object of vehicle 
			SportCar sportCar = new SportCar(noOfWheels, noOfPassengers, model, make, noOfDoors);
			sportCar.displaySportCar();
			break;	
		}
		
		scanner.close();
	}
}
	
