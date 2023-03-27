package narvia.divisibleNum;

public class DivisibleNum2 {
    public static void main(String[] args) {
        System.out.print(" Divisible By 15 ");
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {

                System.out.print(i + " ");
            }
        }
        System.out.print( " \n " +"Divisible By 3 ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n" + " Divisible By 5  ");
        for (int i = 1; i <= 100; i++) {

            if (i % 5 == 0 && i % 15 != 0) {
                System.out.print(i + " ");

            }
        }
    }
}


