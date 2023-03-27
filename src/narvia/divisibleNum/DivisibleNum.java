package narvia.divisibleNum;

import java.util.SortedMap;

public class DivisibleNum {
    public static void main(String[] args) {

        int num = 100;
        String divBy15 = "";
        String divBy5="";
        String divBy3="";

        for (int i = 1; i <=100 ; i++) {
            if(i % 15 == 0){
                divBy15 += i +" ";
            }
            if(i % 5 == 0){
                divBy5 += i +" ";
            }
            if(i % 3== 0){
                divBy3+= i+" ";
            }
        }
        System.out.println("Divisible By 15 "+ divBy15);
        System.out.println("Divisible By 5 "+ divBy5);
        System.out.println("Divisible By 3 "+ divBy3);

        }
    }

