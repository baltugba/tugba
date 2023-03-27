package narvia.frequenyOfChar;

public class FrequencyOfChar {

    public static void main(String[] args) {

        System.out.println(FrequencyOfChar("AAABBCDD"));
    }
    public static String FrequencyOfChar(String str){
        String result = "";
        int count = 0;
        char temp = str.charAt(0);

        for (char c : str.toCharArray()) {
            if(temp == c) {
                count++;
            } else {
                result +=  ""+temp + count;
                temp = c;
                count = 1;
            }
        }
        result += ""+temp + count;

        return result;
    }


}
/*

String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

