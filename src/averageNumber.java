// This program finds the average of numbers input by the user.

// java.util.Scanner is imported so that the user can input data.
import java.util.Scanner;

public class averageNumber {

	public static void main(String[] args) {
		
		/* 
		 	Three variables are declared with the data type set to integer. 
		 	user_number is set to a random number, counter is set to -1 and total is set to 0.
		*/
		int user_number = 1;
		
		int counter = -1;
		
		int total = 0;
		
		// A while loop runs for as long as user_number is not 0.
		while (user_number != 0){
			
			// The user is asked to input an integer. The while loop will run until the user inputs 0.
			System.out.println("Enter an integer (enter 0 to calculate the average): " );
			
			Scanner s = new Scanner(System.in);
			
			user_number = s.nextInt();
			
			// The counter number is increased by 1 each time the while loop runs.
			counter ++;
			
			// The number entered by the user is added to the total.
			total += user_number;
			
		}
		
		// The counter variable is displayed and shows the amount of numbers the user input - minus 1 for the 0 input at the end.
		System.out.println("The total number of integers added: " + counter);
		
		// The total of all the integers added together is printed.
		System.out.println("Total: " + total);
		
		// An if statement runs when the total is not 0.
		if (total !=0) {
			// The average is calculated by taking the total and dividing it by the counter. The result is printed.
			int average = total / counter;
			
			System.out.println("Average: " + average);
		
		} else {
			// If the total is zero, the user is told that the average cannot be calculated.
			System.out.println("You cannot divide by zero. The average cannot be calculated.");
		}
	}

}
