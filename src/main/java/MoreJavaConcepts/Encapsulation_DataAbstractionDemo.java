package MoreJavaConcepts;

public class Encapsulation_DataAbstractionDemo {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Encapsulation_DataAbstractionDemo d = new Encapsulation_DataAbstractionDemo();
		d.setName("John");
		d.setAge(25);
		System.out.println("My name is: "+d.getName());
		System.out.println("My age is: "+d.getAge());
	}

}
