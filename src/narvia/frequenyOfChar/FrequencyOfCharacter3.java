package narvia.frequenyOfChar;

public class FrequencyOfCharacter3 {
    public static void main(String[] args) {
        String str = "acbacbc";
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            if (str.charAt(i) == ch) { //if the character of the string is equal to the given character, it means the given character has appeared in the string
                count++;

            }


        }
        System.out.println(count);
    }
}

