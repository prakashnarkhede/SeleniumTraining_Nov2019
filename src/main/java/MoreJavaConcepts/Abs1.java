package MoreJavaConcepts;

public abstract class Abs1 {
	//create abstract class
	//hide implementation details
	//just provide method name
	//abstract class --> can have abstract + non abstract metods
	//abstract class can have main method
	//we can not instantiate Abstract classes
	
	//we need to extend them
	//create constructor in abstract classes
	public Abs1() {
System.out.println("ABs1 constructor");
}

	public abstract void deposit(); // method without body are abstract method
	
	public abstract void withdrawal();
	
	public abstract void interest();
	
	public void welcomeToAll() {
		System.out.println("Welcome to every one !!!!!");
	}
	public static void main(String[] args) {
		System.out.println("main method");
	}
}
