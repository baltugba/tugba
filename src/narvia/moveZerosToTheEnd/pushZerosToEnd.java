package narvia.moveZerosToTheEnd;

import java.util.Arrays;

public class pushZerosToEnd {
    public static void pushZerosToEnd(int arr[]) {// i create static method it will accapt int array
        int count = 0; //it will start index 0

        for (int i = 0; i < arr.length; i++) { //
            if (arr[i] != 0) { // arr[0] =  1  //1!=0 // arr[5] 0 != 0
                arr[count] = arr[i]; // arr[0]=arr[0] ,1 9 8 4 2 7 6 9
                count++;   //count 1// 2

            }
        }

        while (count < arr.length) {  //10  count 5 arrayınde 0 dan farklı 5 rakamı yerleştirdim.
            arr[count] = 0; // 5<10 yerlere 0 koy  5 0 6 0 7 0 8 0 9 0
            count++;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,0,2,0,3,0,4,0};
        pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));


    }

}
//Array - Move Zeros to the End
//Write a method that can move all the zeros to the last indexes of the array (Do
//Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
//0]