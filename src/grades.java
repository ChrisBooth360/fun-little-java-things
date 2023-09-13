// This program takes an array of test scores, calculates the average and returns a letter grade for average grade.

public class grades {

    public static void main(String[] args){

        // An integer array is declared with 5 fictitious test results.
        int[] myTestResults = {75, 80, 67, 42, 54};

        // A variable is declared that will store the total of all the scores.
        int totalScore = 0;

        // A for loop runs for the length of the myTestResults array where index is equal to zero and increases by 1 each loop.
        for (int index = 0; index < myTestResults.length; index++){

            // Each item in the array myTestResults is added to 'totalScore'.
            totalScore += myTestResults[index];
        }

        // The total score is divided by the length of the array to get the average score.
        int averageScore = totalScore / myTestResults.length;

        // The average score is displayed.
        System.out.println("Your average grade is: " + averageScore);

        // Else if statements run that check the average score and assign the appropriate letter grade, informing the user.
        if (averageScore >= 80){
            System.out.println("Congratulations! You got an A!");
        } else if (averageScore >= 70){
            System.out.println("Well done! You got a B!");
        } else if (averageScore >= 60){
            System.out.println("You got a C!");
        } else if (averageScore >= 50){
            System.out.println("You got a D.");
        } else {
            System.out.println("Sadly, you got an F.");
        }

    }

}
