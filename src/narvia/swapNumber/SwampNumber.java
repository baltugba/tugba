package narvia.swapNumber;

public class SwampNumber {
    public static void main(String[] args) {

        int x = 20;
        int y = 30;
        System.out.println("x = " +x+ " y= "+ y);
        x = x+y; // x= 20+30 x= 50
        y = x-y; // y =50-30 y= 20
        x = x-y; //x= 50-30 x= 30

        System.out.println("x = " +x+ " y= "+ y);

        System.out.println("__________________________________________________");

        int num1 = 12;
        int num2 = 2;
        System.out.println(num1+ " is first");
        System.out.println(num2+ " is second");

        num1 = num1+num2;//12+2 =14
        num2 = num1-num2;//new num1 =14 -num2 = new num2= 12
        num1 = num1-num2;// previous new num 14 - previous new num2 12 = 2 is new num1

        System.out.println(num1 + " is first number");
        System.out.println(num2 + " is second number");



    }

}
// swap two variable values without using a third variable