package narvia.sortAscendingNumber;

import java.util.Arrays;

public class SortAscending2 {
    public static int[] arrayAscending(int[] numbers) { //creating our static method so we can call from class name

        int[] result = Arrays.copyOfRange(numbers, 0, numbers.length);//we are creating a new array, by copying the numbers[]

        for (int i = 0; i < result.length; i++) {    //we going through (iterate) each element of new array result[] with for loop
            for (int j = 0; j < result.length; j++) {  //we created another for loop to compare the 2 value of each element)
                if (result[i] < result[j]) {  //if elements of result[i] is less than elements of result[j] in order to store them in ascending order
                    Integer temporary = result[i]; //store them inside the wrapper class Integer 'temporary' variable
                    result[i] = result[j];  //reassign result[i] to result[j]
                    result[j] = temporary;  //reassign result[j] to temporary variable//so we change their place using the temp value
                }

            }

        }
        System.out.println(Arrays.toString(result));  ////in order to print we need Arrays to String method
        return result;

    }

    public static void main(String[] args) {
        arrayAscending(new int[]{5, 3, 9, 7, 1, 0, 10, 2, 4, 6, 8, -22});
    }
}
