package week3.day1;

public class AxisBank extends BankInfo 
{
	public void deposit()
	{
		System.out.println("Calls deposit() method - AxisBank");
	}

	public static void main(String[] args) {
		
		//Creating object for child class
		AxisBank axisBank = new AxisBank();
		
		//Calling parent class methods from child class object
		axisBank.saving();
		axisBank.fixed();
		
		//Overrides the parent class method by calling the method using child class object
		axisBank.deposit();
	}

}
