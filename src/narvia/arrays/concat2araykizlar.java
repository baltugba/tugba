package narvia.arrays;

import java.util.Arrays;

public class concat2araykizlar {
    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {
        // Create a new array with a size that is equal to the sum of the lengths of the input arrays.
        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        // Iterate through each element of arr1 and copy it to the result array.
        for (int each : arr1) {
            result[i++] = each;
        }

        // Iterate through each element of arr2 and copy it to the result array.
        for (int each : arr2) {
            result[i++] = each;
        }

        // Return the concatenated array.
        return result;
    }

    public static void main(String[] args) {
        // Create two input arrays.
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {5,6,7,8};

        // Call the concatTwoArrays method and print the concatenated array.
        System.out.println("concatTwoArrays(arr1,arr2) = " + Arrays.toString(concatTwoArrays(arr1, arr2)));
    }

}
