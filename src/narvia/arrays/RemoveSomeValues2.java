package narvia.arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveSomeValues2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(150);
        numbers.add(200);
        //i will create new list
        List<Integer> lessThenHundred = new ArrayList<>();
        for (int num: numbers){
            if(num <=100){
                lessThenHundred.add(num);

            }

            }
        System.out.println("Original list"+ numbers);
        System.out.println("New list"+ lessThenHundred);
        }

}
