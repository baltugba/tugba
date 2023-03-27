package narvia.sortDesending;

import java.util.Arrays;

public class SortDescending2 {
    public static int[] arrayDescending(int[] numbers) { //creating our static method so we can call from class name
        int[] result = Arrays.copyOfRange(numbers, 0, numbers.length);  //used copy of method to create a new array to compare

        for (int i = 0; i < numbers.length; i++) {  ////going through every element of array-to iterate each element with for loop
            for (int j = 0; j < numbers.length; j++) {   //creating second loop  to compare each element with each other
                if (result[i] > result[j]) {  //if result[i] element is greater than result[j] elements//
                    // to make is descending order if its greater than the other element than we are swaping
                    Integer temporary = result[i]; //store them inside the wrapper class Integer 'temporary' variable
                    result[i] = result[j]; //reassign i to j
                    result[j] = temporary;//reassign j to temporary so we change their place using the temporary value
                }
            }
        }
        System.out.println("Result = " + Arrays.toString(result)); //in order to print we need Arrays to String method
        return result;
    }

    public static void main(String[] args) {

        arrayDescending(new int[]{10, 50, 40, 20, 30, 70, 60, 80, 100, 90,-20});

    }
}
