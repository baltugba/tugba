package narvia.swapNumber;

public class SwapNumber2 {
    public static void main(String[] args) {

        int x = 5;
        int y = 2;

        System.out.println("x = " +x+ " y= "+ y);

        x = x * y;// 5*2=10 x=10
        y = x / y; // 10/2=5 y=5
        x = x / y; // 10/5=2 x=2

        System.out.println("x = " +x+ " y= "+ y);

    }
}
