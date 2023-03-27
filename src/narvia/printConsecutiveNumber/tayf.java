package narvia.printConsecutiveNumber;

public class tayf {
    public static void main(String[] args) {




        String result = "";

        for (int i = 1; i <= 24; i++) {
            result = "";
            if (i % 2 == 0) {
                result = "codility";
            }
            if (i % 3 == 0) {
                result += "test";
            }
            if (i % 5 == 0) {
                result += "coders";
            }
            if (result.equals("")) {
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }
}
