package narvia.arrays;

import java.util.Arrays;

public class ConcatTwoArrays {
    //1) Array - Concat two arrays
    //Write a return method that can concate two arrays
    public static void main(String[] args) {
        int[] arr1 ={1,2,3};
        int[] arr2 ={4,5,6};
        int[] arr3 = concatArrays(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] concatArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }

}

