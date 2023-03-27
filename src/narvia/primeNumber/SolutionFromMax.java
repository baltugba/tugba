package narvia.primeNumber;


public class SolutionFromMax {

    public static void main(String[] args) {
        System.out.println(primeNumber(122355667));
    }
    public static boolean primeNumber(int num) {

        if(num <= 1){
            return false;
        }
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
