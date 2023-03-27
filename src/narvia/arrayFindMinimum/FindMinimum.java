package narvia.arrayFindMinimum;

import javax.swing.plaf.PanelUI;

public class FindMinimum {
    public static int MinValue(int[]arr){
        int min = Integer.MAX_VALUE; // WE NEED A TEM VALUE SO WE CAN ASSIGN THE MIN VALUE TO IT
        //BUT THIS VALUE HAS TO BE BIGGEST NUMBER, SO EVERY NUM WILL BE SMALLER THAN THAT
        //YOU CAN ALSO ASSIGN -2147483647 IS THE MAX INTEGER NUMBER
        //to get that number as value we use wrapper classes obj and make our java give time the max value to tem value
        for(int each : arr){//we loop through each element of our array
            if(each<min){//if each element smaller than min(has to be smaller because min value is actually the biggest number
                min=each;//we are assigning each value to min

            }
        }
        return min; //so when we return min it will give us the min number of our array
    }

    public static void main(String[] args) {
        int[] arr1 ={10,20,30,40,-400,-200,65};
        System.out.println("MinValue(arr1) = " + MinValue(arr1));
    }
}
