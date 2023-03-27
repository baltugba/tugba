package U;

import java.util.Scanner;

public class bal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username = "Cydeo";
        String key = "Cydeo123";
        String result = "";


        System.out.println("Enter your username:");
        String userName = input.next();
        System.out.println("Enter your password:");
        String password = input.next();


        for (int i = 1; i < 3; i++) {
            if (!userName.equals(username) && !key.equals(password)) {
                System.out.println("Please re enter your information");
                System.out.println("Enter your username:");
                userName = input.next();
                System.out.println("Enter your password:");
                password = input.next();
                result = "Your account is locked:";

            } else {
                result = "Logged in \n Welcome to your Cydeo account";
            }

        }
        System.out.println(result);
        input.close();


        }
    }
