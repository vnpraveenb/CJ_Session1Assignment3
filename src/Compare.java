 import java.util.Scanner;

public class Compare {
	
	
	// Method to take in the input, evaluate and print the output of BITWISE and LOGICAL AND
	public static void inputAndEvaluate(byte a, byte b)
	  {
			 	
		// Taking the 1st number as input
		System.out.println("Please input the 1st number:  ");
		Scanner input1 = new Scanner(System.in);
		a = input1.nextByte();
				
		// Taking the 2nd number as input
		System.out.println("Please input the 2nd number:  ");
		Scanner input2 = new Scanner(System.in);
		b = input2.nextByte();
		 
		//Printing the result of BITWISE AND	  
		System.out.println("The result of Bitwise AND is : "+ (byte) (a & b));
			
			
		//Printing the result of LOGICAL AND
		if(a>0 && b>0)
		{
			System.out.println("The result of Logical AND is : "+ 1);
		}
		else
		{
			System.out.println("The result of Logical AND is : "+ 0);
			    	 
		}	  
		
	  }
		
 
	public static void main(String[] args) {
		
	  byte a =0; // Initialising variable
	  byte b =0; // Initialising variable
	  
	  System.out.println("Comparing the truth table of BITWISE and LOGICAL AND");
	  System.out.println("----------------------------------------------------");
	  

	  //Inputting and comparing the output for all 4 combinations possible in the truth table
	  for(int i = 0; i<4;i++)
	  {
 		  inputAndEvaluate(a,b);
		  System.out.println();
	  }
	  
	}

}
