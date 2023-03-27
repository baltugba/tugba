package narvia.divideWirhoutOperator;

import java.util.Scanner;

public class NumberDivideWithOutOperator1 {
    public static void main(String[] args) {

        int result=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1= scan.nextInt();
        System.out.println("Enter your second number");
        int num2 = scan.nextInt();

        while(num1>=num2){
            num1 = num1-num2;
            result++;
        }
        System.out.println("Division is: "+ result);
    }
}
