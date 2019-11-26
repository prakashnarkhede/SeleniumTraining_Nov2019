package MoreJavaConcepts;

public class AbsImpementation extends Abs1{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Implemenataion from Axis bank");
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		System.out.println("Implemenataion from Axis bank");
		
	}

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("Implemenataion from Axis bank");
	}
	
		public static void main(String[] args) {
	//	Abs1 ab = new Abs1();
			AbsImpementation ab = new AbsImpementation();
			ab.deposit();
			ab.interest();
			ab.withdrawal();
	}

}
