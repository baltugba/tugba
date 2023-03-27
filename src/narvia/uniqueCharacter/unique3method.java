package narvia.uniqueCharacter;

public class unique3method {
    public static void main(String[] args) {
        System.out.println(unique("aaabbcgtss"));
    }

    public static String unique(String str) {
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j =0; j < str.length(); j++) {
                if (i != j) {// kendisiyle çakışmaması için
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
            }
            if (count == 0) {
                temp = temp + str.charAt(i);
            }
        }
        return temp;
    }
}
