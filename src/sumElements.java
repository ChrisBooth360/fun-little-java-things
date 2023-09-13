// This program adds together all the items in a specified column.

// java.util.Arrays is imported in order to display the two-dimensional array.
import java.util.Arrays;

public class sumElements {

    public static void main(String[] args){

        // A two-dimensional double array is declared with three rows and four columns.
        double[][] elementList = new double[3][4];

        // The user is asked to enter four items for the first row.
        java.util.Scanner newRowOneItem = new java.util.Scanner(System.in);
        System.out.print("Please enter " + (elementList.length + 1) + " values for the first row: ");

        /*
            A for loop assigns each item entered by the user to the first row of the two-dimensional array.
            One is added to the array length as the length only shows the number of rows and there are four columns.
         */
        for (int i = 0; i < elementList.length + 1; i++){
            elementList[0][i] = newRowOneItem.nextDouble();
        }

        // The user is asked to enter four items for the second row.
        java.util.Scanner newRowTwoItem = new java.util.Scanner(System.in);
        System.out.print("Please enter " + (elementList.length + 1) + " values for the second row: ");

        // A for loop assigns each item entered by the user to the second row of the two-dimensional array.
        for (int i = 0; i < elementList.length + 1; i++){
            elementList[1][i] = newRowTwoItem.nextDouble();
        }

        // The user is asked to enter four items for the third row.
        java.util.Scanner newRowThreeItem = new java.util.Scanner(System.in);
        System.out.print("Please enter " + (elementList.length + 1) + " values for the third row: ");

        // A for loop assigns each item entered by the user to the third row of the two-dimensional array.
        for (int i = 0; i < elementList.length + 1; i++){
            elementList[2][i] = newRowThreeItem.nextDouble();
        }

        // A series of double variables are declared that will store the sum of each column.
        double columnOne = 0;
        double columnTwo = 0;
        double columnThree = 0;
        double columnFour = 0;

        // A for loop is used to calculate the sum of each column.
        for (int i = 0; i < elementList.length; i++){
            columnOne += elementList[i][0];
            columnTwo += elementList[i][1];
            columnThree += elementList[i][2];
            columnFour += elementList[i][3];
        }

        // Each row of the two-dimensional array is displayed - this will help the user visualise the column they want the sum of.
        System.out.println(Arrays.toString(elementList[0]));
        System.out.println(Arrays.toString(elementList[1]));
        System.out.println(Arrays.toString(elementList[2]));

        // A while loop will run while loop equals 1.
        int loop = 1;
        while (loop == 1){

            // The user is asked which column they would like the sum of.
            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.print("Please choose which column you'd like to find the sum of (1 - " + (elementList.length + 1) + "). Enter -1 to exit: ");
            int columnChoice = input.nextInt();

            // Else if statements run based on the user's choice of 1 to 4 or -1. The first if statement will print the sum of the first column.
            if (columnChoice == 1){
                System.out.println("The total for the first column is: " + columnOne);
            // If the user chooses 2, the sum of the second column is displayed.
            } else if (columnChoice == 2){
                System.out.println("The total for the second column is: " + columnTwo);
            // If the user chooses 3, the sum of the third column is displayed.
            } else if (columnChoice ==3){
                System.out.println("The total for the third column is: " + columnThree);
            // If the user chooses 4, the sum of the fourth column is displayed.
            } else if (columnChoice == 4){
                System.out.println("The total for the fourth column is: " + columnFour);
            // If the user chooses -1, the while loop will exit after 'Goodbye' is displayed.
            } else if (columnChoice == -1){
                System.out.println("Goodbye!");
                loop = 0;
            // If the user inputs anything else, they are asked to try again.
            } else {
                System.out.println("Your choice is invalid. Try Again.");
            }
        }
    }
}
