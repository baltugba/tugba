package loop;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter our age");
        int age = input.nextInt();

        while(!(age >=1 && age <=120)){
            System.err.println("Invalid entry. re enter again");
           age= input.nextInt();


        }
        System.out.println("Are you Us citizen? yes/no");
        String yesOrNo=input.next().toLowerCase();

        while(!(yesOrNo.equals("yes")  || yesOrNo.equals("no"))){
            System.err.println("Invalid entery re enter again");
            yesOrNo=input.next();
        }
if(age>=21 && yesOrNo.equals("yes")){
    System.out.println("you are eligible to vote");
}else{
    System.out.println("you are not eligible");
}
input.close();
    }
}
