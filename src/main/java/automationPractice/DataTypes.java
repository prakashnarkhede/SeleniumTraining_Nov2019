package automationPractice;

public class DataTypes {

	public static void main(String[] args) {
		int i = 100;
		byte j = 100; // up to 127 max
		short sh = 10000; //up to 32767
		int in = 900000000;
		float f = 100.5F;
		
		int[] arr = {2,3,5,6};
		String[] strArray = {"Str1", "Str3", "Str4"};
		
		
		//check this
		long l = 1000000000;
		
		Long l1 = new Long(1000000000);
		System.out.println(l1.MAX_VALUE);
		
		boolean flag = false;
		
		if(flag) {
			System.out.println("Flag is true");
		}
		
		char charA = 'A';
		char charB = 'b';

	}

}
