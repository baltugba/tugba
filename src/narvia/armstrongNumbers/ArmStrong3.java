package narvia.armstrongNumbers;

public class ArmStrong3 {
    private static boolean isArmStrong(int number) {
        int result = 0;
        int num = number;
        while (number != 0) {
            int remain = number % 10;
            result = result + remain * remain * remain;
            number = number / 10;
        }
        if (num == result) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        System.out.println(isArmStrong(153));


    }


}

