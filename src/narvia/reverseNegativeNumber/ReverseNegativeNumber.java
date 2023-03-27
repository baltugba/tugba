package narvia.reverseNegativeNumber;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        reverseNum(-123);
    }
    /*
    3. Number -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
     */

    public static void reverseNum(int number) {
        if (number < 0) {
        reverseNum(number * -1);
        } else if (number < 10) {
            System.out.println(number);
        } else {
            System.out.print(number % 10);
            reverseNum(number / 10);
        }
    }
}