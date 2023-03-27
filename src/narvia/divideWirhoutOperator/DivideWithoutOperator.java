package narvia.divideWirhoutOperator;

public class DivideWithoutOperator {


        //static int result ;
       public static void divide(int num1, int num2){
          int result=0;
           while(num1>=num2){
           num1=num1-num2;
           result++;
           }
           System.out.println("Division is "+ result);

    }




}
