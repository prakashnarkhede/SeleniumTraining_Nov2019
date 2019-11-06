package automationPractice;

public class ControlStatements {

	public static void main(String[] args) throws Exception {
		//if else statement
		if(3>1) {
			System.out.println("Condition is true");
			
		} else {
			System.out.println("Condition is false");
		}
		
		//nested if else
		
		if(3>1) {
			if(4>5) {
				System.out.println("Condition is true");				
			}
		} else {
			System.out.println("Condition is false");
		}
		
		
		//multiple if else // checking mulktiple conditions
		
		if(3>4) {
			System.out.println("Condition is true");				
		} else if (4<3) {
			System.out.println("2nd Condition is true");				

		} else {
			System.out.println("Condition is false");				

		}
		
		//switch case control statement
		String browserType = "Chrome1";
		
		switch(browserType) {
		case "FF":
			System.out.println("Browser selected if FF");
			break;
		case "Chrome":
			System.out.println("Browser selected is chrome");
			break;
		default :
			System.out.println("None of the case is matching");
		}

		
		//Loops - Do, while, for loop
		
//		do {
//			System.out.println("Do statement got executed");
//		}while(3>4);
		
		
		int i = 1;
		while(i>3) {
			System.out.println("while is executed");
		} i = i+1;
		
		//for loop
		
		for(int j=0; j<10; j++) {
			//when j ==5, skip execution --> continue
			if(j==5) {
				continue;
			}
			System.out.println("for loop for executed, value of j is: "+j);
		}
		
		
		//break statement
		for(int j=0; j<10; j++) {
			//when j == 5, stop execution of this loop --> break;
			if(j==5) {
				break;
			}
			
			System.out.println("value of j is: "+j);
		}
		
		System.out.println("After exexuting for loop");
		
		
		
		//return statement - return execution control back
		for(int j=0; j<10; j++) {
			//when j == 5, stop execution of this loop --> break;
			if(j==5) {
				//return;
			}
			
			System.out.println("return statemnt - value of j is: "+j);
		}
		
		
		//throw statement - terminate and throw error message
				for(int j=0; j<10; j++) {
					//throw statement - terminate and throw error message
					if(j==5) {
						throw new Exception("Exception is at j =5");
					}
					
					System.out.println("throw statement - value of j is: "+j);
				}
	}

}
