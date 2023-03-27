package narvia.printConsecutiveNumber;

public class PrintConsecutiveNumber {

    public static void main(String[] args) {
        int n=24;
        String codility= "codility";
        String test= "test";
        String coders= "coders";


        for (int i = 0; i <= 100; i++) {
            if( i % 2 == 0 && i %3 == 0 && i %5 == 0){
            //    System.out.println(codility+" "+ test + " " + coders);

            }else if (i %2 == 0){
                System.out.println(codility+" ");
            } else if (i %3 == 0) {
                System.out.println(test+" ");

            } else if (i %5 == 0) {
                System.out.println(coders+" ");

            } else if (i%2 == 0  && i %3 == 0) {
                System.out.println(codility+test);

            } else if (i%2 == 0 && i %5 == 0){
                System.out.println(codility+coders);

            } else if (i %3 == 0 && i %5 == 0) {
                System.out.println(test+coders);

            }else{
                System.out.println(i);
            }

        }
        System.out.println();


    }
}
/*
write a function:
that given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2,3 or 5
should be replaced by the word Codility, Test or Coders respevtively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should
 be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example numbers divisible by both 2 and 3 should
 be replace by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTesrCoders.
 */

