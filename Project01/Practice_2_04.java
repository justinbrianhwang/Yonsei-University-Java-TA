package 윤영욱교수님;

public class Practice_2_04 {

	public static void main(String[] args) {
		// Find and print the VAT on the sales amount
		/*
		The tax rate is 6%.
		Declare all variables as double, 
		cast the result to int and output as int
		
		How to calculate
		(1) Save prices ($197.55)
		(2) Finding VAT through formulas
				tax = amount * 6%
		(3) Casting the resulting value from double to 
		int and printing it to the screen 
		*/
		double amount = 197.55;
		double tax = amount * 0.06;
		
		System.out.println("Sales tax is $" + (int)tax);

	}

}
