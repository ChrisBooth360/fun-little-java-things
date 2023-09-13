/*
This program removes all duplicates from an array. I struggled with this assignment and did some research for help.
I used Programming Tutorials (https://www.youtube.com/watch?v=NRk_XPi6FwE) and Java Point
(https://www.javatpoint.com/java-program-to-remove-duplicate-element-in-an-array) for help.
 */

// java.util.Arrays was imported to help with sorting the array.
import java.util.Arrays;

public class NoDups {
    public static void main(String[] args) // main method declaration.
    {
        // An array is declared with a list of integers.
        int[] checkArray = {20, 100, 10, 80, 70, 1, 0, -1, 2, 10, 15, 300, 7, 6, 2, 18, 19, 21, 9, 0};
        int length = checkArray.length; // The length of the above array is stored in the variable 'length'.

        // The original array is printed out using a for loop.
        System.out.println("Original Array:");

        for (int i = 0; i < length; i++){
            System.out.print(checkArray[i] + " ");
        }

        // The method 'removeDuplicates()' is called with the array and its length as the arguments. A new length is returned.
        int newLength = removeDuplicates(checkArray, length);

        // The final array is printed out using a for with the duplicates deleted.
        System.out.println();
        System.out.println("Final Array:");

        /*
        By using the newLength in the termination expression, only that number of items in the array are printed.
        If the full array were printed, new duplicates would occur as the array has a set length that cannot be changed.
        */
        for (int i = 0; i < newLength; i++){
            System.out.print(checkArray[i] + " ");
        }
    }

    // A new static method is declared which will return an integer. An array and its length are used as the arguments.
    public static int removeDuplicates(int[] toCheckArray, int length){
        // Arrays.sort() is used to sort the array in ascending order - this will help detect the duplicates.
        Arrays.sort(toCheckArray);

        // An integer is declared and set to 0. This will become the second index number in the for loop.
        int secondIndex = 0;

        // A for loop is run over the array in order to delete duplicates.
        for (int index = 0; index < length - 1; index++){ // 1 is subtracted from the length due to the index point starting at 0.

            // An if statement runs that checks whether the point at 'index' is no equal to the point at 'index + 1'.
            if (toCheckArray[index] != toCheckArray[index + 1]) {
                /*
                If the two numbers are not equal, then the point at the 'secondIndex' is updated to hold the value of the point at 'index'.
                If the two numbers are equal, then that index point is passed over. 'secondIndex' is increased by one each time the for loop runs.
                */
                toCheckArray[secondIndex++] = toCheckArray[index];
            }
        }
        /*
        Due to the final index having nothing to compare with (as 'index + 1' won't exist),
        one is added to the secondIndex and it is given the value at the final index point of the array.
        */
        toCheckArray[secondIndex++] = toCheckArray[length - 1];
        /*
        'secondIndex' is returned from the method, and ,due to arrays being updated in methods,
        'toCheckArray' now contains no duplicates from index 0 to the index number of 'secondIndex'.
        */
        return secondIndex;
    }
}
