// This program compares two arrays that are created by the user.

// java.util.Arrays is imported that will help with comparing the two arrays.
import java.util.Arrays;

public class identicalArrays {

    public static void main(String[] args){

        // An integer array is declared that will have five numbers.
        int[] arrayOne = new int [5];

        // The user is asked to enter five values (this is based on the array's length of five).
        java.util.Scanner newArrayOneItem = new java.util.Scanner(System.in);
        System.out.print("Please enter " + arrayOne.length + " values: ");

        // A for loop assigns the five values entered by the user to the array.
        for (int i = 0; i < arrayOne.length; i++){
            arrayOne[i] = newArrayOneItem.nextInt();
        }

        // A second integer array is declared, also with five numbers.
        int[] arrayTwo = new int [5];

        // The user is asked to enter another five values (the length of the array).
        java.util.Scanner newArrayTwoItem = new java.util.Scanner(System.in);
        System.out.print("Please enter another " + arrayOne.length + " values: ");

        // A for loop assigns the five values entered by the user to the array.
        for (int i = 0; i < arrayOne.length; i++){
            arrayTwo[i] = newArrayTwoItem.nextInt();
        }

        /*
         Arrays.equals is used to determine whether two arrays are equal. I learnt this from Geeks For Geeks:
         https://www.geeksforgeeks.org/compare-two-arrays-java/
         If they are equal, then the user is told so. If not, they are told they are not identical.
        */
        if (Arrays.equals(arrayOne, arrayTwo)){
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
    }
}
