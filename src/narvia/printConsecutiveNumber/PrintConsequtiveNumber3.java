package narvia.printConsecutiveNumber;

public class PrintConsequtiveNumber3 {
    public static void main(String[] args) {

        int n = 24;
        /*
        String divByTwo = "codility";
        String test = "test";
        String coders = "coders";

*/
        String result = "";
        for (int i = 1; i <= 24; i++) {
      //   String   result = "";
            if (i % 2 == 0) {
                result = "codility";
            }
            if (i % 3 == 0) {
                result = "test";
            }
            if (i % 5 == 0) {
                result = "coders";
            }
            /*
            if (i % 2 == 0 && i % 3 == 0) {
                result = "codilitytest";
            }
            if (i % 2 == 0 && i % 5 == 0) {
                result = "codilitycoders";
            }
            if (i % 3 == 0 && i % 5 == 0) {
                result = "testcoders";
*/

            if (result == "") {
                System.out.println(i);
            }
            System.out.println(result);

        }

    }
}
