package narvia.arrays;

import java.util.ArrayList;

public class RemoveSomeValues {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(120);
        numbers.add(150);

        System.out.println("Original list"+ numbers);
        numbers.removeIf(number -> number >100);
        System.out.println("after remove"+ numbers);
    }
}
