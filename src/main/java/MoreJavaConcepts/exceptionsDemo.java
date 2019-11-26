package MoreJavaConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exceptionsDemo {
	
	public void readFile() throws FileNotFoundException {
		File f1 = new File("demopathName");
		FileInputStream fis = new FileInputStream(f1);

	}
	
	public void callReadFile() throws FileNotFoundException {
		exceptionsDemo d = new exceptionsDemo();
		d.readFile();
	}
	public void callcallReadFile() {
		exceptionsDemo d = new exceptionsDemo();
		try {
			d.callReadFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		//throw keyword demo
		// throw keyword ==> give explicit exception
	int age = 17;
	if(age < 18) {
		throw new Exception("Sorry, you not enter . . . .");
} else {
		System.out.println("you are good to login inside . . . .");
	}
		
		
		
		
		//general try catch demo
		int i = 0;
		int j = 10;
		
		try {
			System.out.println(j/i);	
		//	throw new FileNotFoundException("demoException");
		} catch(NullPointerException e) {  // arithmatic // nullpointer //exception
			System.out.println("null pointer exception has occured");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException has occured");
		}catch (Exception e) {
			System.out.println("Exception has occured");
		}finally {
			System.out.println("finally block got executed");
		}
		
		
		System.out.println("after devide statement");
		File f1 = new File("demopathName");
		try {
			FileInputStream fis = new FileInputStream(f1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//db connection 1. create connection 2. execute sql 3. disconnect db connection (close)
		try {
			//add seteps for connecting to database
			//1. create connection 
			//2. execute sql
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		} catch(Exception e) {
			//what to do of exception occurs
		}
		finally {
			//3. disconnect db connection (close)
			
		}
		
			
		}
		
	}

