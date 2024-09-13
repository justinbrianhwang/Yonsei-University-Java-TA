package 윤영욱교수님;

public class Practice_2_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	int val1 = 15;
			if (val1 > 10) {
			int val2 = val1 - 10;
			}
			int val3 = val1 + val2 + 5;
			Fix the errors in this code. 
		  
		 */
		int val1 = 15;
		int val2 = 0; // Variables inside a block are deleted the moment the block ends. 
		if (val1 > 10)
			val2 = val1 - 10;
		int val3 = val1 + val2 + 5;
		System.out.println(val3);
	}

}
