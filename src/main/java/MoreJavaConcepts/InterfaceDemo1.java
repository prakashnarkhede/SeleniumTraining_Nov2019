package MoreJavaConcepts;

 interface InterfaceDemo1 {
	//all methods should be abstract
	//in lastest version of java, we can use not abstract methods like default, static
	public abstract void deposit(); // method without body are abstract method
	
	public abstract void withdrawal();
	
	public abstract void interest();
	
}
