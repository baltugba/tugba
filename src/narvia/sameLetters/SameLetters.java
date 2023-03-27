package narvia.sameLetters;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {

        String a= "abc";
        String b="bca";
        System.out.println(same(a,b));

    }




    public static boolean same(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();


        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1 = "", a2 = "";

        for (char each : ch1) {
            a1 += each;
        }

        for (char each : ch2) {
            a2 += each;
        }

        return a1.equals(a2);
    }
}
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */

