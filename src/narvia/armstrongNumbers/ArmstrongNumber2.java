package narvia.armstrongNumbers;

import java.util.Scanner;

public class ArmstrongNumber2 {
    public static void main(String[] args) {
        int num = 154;
        if(isArmstrong(num)){
            System.out.println(num+ " The num is armstrong");
        }else{
            System.out.println(num +" The num is not armstrong");
        }



    }

    public static boolean isArmstrong(int num){
        //153
         int t = num;
         int sum = 0;
         int digit = 0;
         while(t >0){
             digit = t % 10;// gives you 3
             t = t / 10;
             sum = sum + digit*digit*digit;//27+125+1=153
         }
         return num == sum;





    }
}
