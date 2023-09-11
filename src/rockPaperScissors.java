// This program allows a user to play rock, paper, scissors with the computer.

// java.util.Scanner is imported so that the user can input data.
import java.util.Scanner;

public class rockPaperScissors {

	public static void main(String[] args) {
		
		/* 
		 	The Math.random() function is used to generate a different number each time. 
		 	As there are three numbers to represent rock, paper and scissors, the function is multiplied by three,
		 	allowing 0, 1, 2 to be randomly generated.
		*/
		int RockPaperScissors = (int) (Math.random()*3);
		
		// The user is asked to input a number from 0 to 2 - with each number representing rock(1), paper(2) or scissors(0).
		System.out.println("Enter 0 for scissors, 1 for rock or 2 for paper: " );
		
		// The Scanner is used to allow the user to input a number in 'user_choice'.
		Scanner s = new Scanner(System.in);
		
		int user_choice = s.nextInt();
		
		
		/* 
		 	A series of else if statements run to check both the program's randomly generated number and the number chosen by the user.
			It then prints out who won based on whether rock (1) beats scissors (0), scissors beats paper (2), or paper beats rock.
			If what the user chooses is the same as the randomly generated number, then a tie is declared.
		*/
		if (RockPaperScissors == 1 && user_choice == 0) {
			
			System.out.println("You chose scissors, computer chose rock: ");
			System.out.println("Rock beats scissors - you lose!");		
		
		} else if (RockPaperScissors == 1 && user_choice == 2) {
			
			System.out.println("You chose paper, computer chose rock: ");
			System.out.println("Paper beats rock - you win!");
		
		} else if (RockPaperScissors == 2 && user_choice == 1) {
		
			System.out.println("You chose rock, computer chose paper: ");
			System.out.print("Paper beats rock - you lose!");
		
		} else if (RockPaperScissors == 2 && user_choice == 0) {
		
			System.out.println("You chose scissors, computer chose paper: ");
			System.out.println("Scissors beats paper - you win!");
		
		} else if (RockPaperScissors == 0 && user_choice == 1) {
		
			System.out.println("You chose rock, computer chose scissors: ");
			System.out.println("Rock beats scissors - you win!");
		
		} else if (RockPaperScissors == 0 && user_choice == 2) {
		
			System.out.println("You chose paper, computer chose scissors: ");
			System.out.println("Scissors beats paper - you lose!");
		
		} else if (RockPaperScissors == user_choice) {
		
			System.out.println("You and the computer both chose the same: ");
			System.out.println("Let's call this a draw");
		
		// If the user has entered anything other than 0, 1, or 2, then this statement runs.
		} else {
			System.out.println("You have entered an invalid option.");
		}
		
	}

}
