package loop;

public class removeDuplicates {
    public static void main(String[] args) {
        String str = "aabbbcccc";
        String result = ""; //abc

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains("" + each)) {
                result += each;

            }

        }

        System.out.println(result);
    }
}
//ex
//str ="aabbbccc;
//output =abc