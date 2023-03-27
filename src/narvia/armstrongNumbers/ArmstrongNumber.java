package narvia.armstrongNumbers;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
      int num = 153;
         if(isArmStrong(num)){
             System.out.println(num+ " is armStrong number");
         }else{
             System.out.println(num+ " is not armStrong number");
         }
    }

    public static boolean isArmStrong(int num){
        int total = 0;
        while(num >0){
            int remainder = num %10;
            total=total+remainder*remainder*remainder;
            num= num /10;
        }
        if(num==total){
            return true;
        }
        return false;

    }
}
