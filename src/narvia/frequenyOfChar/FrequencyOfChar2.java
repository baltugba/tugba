package narvia.frequenyOfChar;

import java.util.Scanner;

public class FrequencyOfChar2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your string value "); //aabcccd
        String str= input.nextLine();

        System.out.println("Enter your char value "); //'c'
        char ch= input.next().charAt(0);
        input.close();

        int frequency=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch){ // each character of the string
                frequency+=1;
            }
        }
        System.out.println("frequency " + frequency);
        input.close();



    }
}
