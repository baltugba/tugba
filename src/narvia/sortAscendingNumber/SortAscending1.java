package narvia.sortAscendingNumber;

import java.util.Arrays;

public class SortAscending1 {
    //Write a return method that can sort an int array in Ascending order without using the sort method
    //of the Arrays class
    //Ex: int[] arr = {10, 9, 8, 7};
    //arr = Sort(arr); ==>{ 7, 8, 9, 10};
    public static int[] sortArray(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9,6,7,1,0,8};
        arr=sortArray(arr);
        System.out.println(Arrays.toString(arr));

    }
}
