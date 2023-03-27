package narvia.divideWirhoutOperator;

import java.util.Scanner;

public class NumberDivideWithOutOperator {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter dividend number");
        int x= scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter divider number");
        int y = scan2.nextInt();

        int z=0; //remainder
        int n=0; //quotient

        while (x>=y) {

            x=x-y;
            n+=1;

        }

        System.out.println("result "+ n);
    }
}
