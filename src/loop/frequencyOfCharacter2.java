package loop;

public class frequencyOfCharacter2 {
    public static void main(String[] args) {
        String str1 = "aaaattttt";
        int count = 0;
        char ch = 't';

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ch) {
                count++;

            }


        }
        System.out.println(count);
    }
}

