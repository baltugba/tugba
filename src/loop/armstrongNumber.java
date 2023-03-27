package loop;

public class armstrongNumber {
    public static void main(String[] args) {
        int an=1634;
        String r= ""+an;

        double sum=Math.pow(Double.parseDouble(r.substring(2,3)),4);
        System.out.println("sum = " + sum);


    }
}
/*
Task 2 :   Write a method that can check if a number is Armstrong number

                Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.

                Armstrong numbers are     === 153 370 371 407 === for 3 digits
 */