package narvia.findMaximum;

public class findMaximum1 {
    //Array -- Find Maximum
    //Write a method that can find the maximum number from an int Array



    public static void findMaximum(int[] numbers) {
        int max = numbers[0];//we are assuming that 1. elements id maximum
        for (int i = 1; i < numbers.length; i++) { //in loop we start from index 1 and compare rest of the elements with index 0
            if(numbers [i]>max)   {//if any of the index numbers greater than index 0, than will be the max number
                max=numbers[i];

            }

        }
        System.out.println("max=" +max);

    }
}
