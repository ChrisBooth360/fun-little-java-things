// This program finds the factorial of a number input by the user.

// java.util.Scanner is imported so that the user can input data.
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		// The user is asked to input a positive integer.
		System.out.println("Enter a positive integer: " );
		
		Scanner s = new Scanner(System.in);
		
		int userInput = s.nextInt();
		
		// An if statement runs if the user inputs a positive integer.
		if (userInput > 0) {
			
			// The initial factorial is set to 1.
			int factorial = 1;
			
			/*
			   	A for loop runs where the initialization expression n = 1 is declared, the termination expression sets the 
			   	termination value to n being anything greater than the userInput, and the increment expression 
			   	adds 1 each time the loop runs.
			*/
			for (int n = 1; n <= userInput; n++) {
				
				// Each time the loop runs the factorial variable is updated to itself multiplied by n.
				factorial = factorial * n;
				
			}
			
			// Once the for loop finishes, the factorial of the number entered will be the final factorial variable. This is then printed.
			System.out.println("The factorial of " + userInput + " is " + factorial);
			
		// If the user inputs any non-positive integer, this error statement will run.
		} else {
			System.out.println("You entered a non-positive integer.");
		}
	}

}
