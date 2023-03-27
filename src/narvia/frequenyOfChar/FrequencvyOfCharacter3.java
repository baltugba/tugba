package narvia.frequenyOfChar;

public class FrequencvyOfCharacter3 {
    public static void main(String[] args) {
        String str = "aabccdeef";
        String result = "";

        for (int i = 0; i < str.length(); i++) { //outer loop bir tane char i secer index numarsina gore
            int count = 0;
            for (int j = 0; j < str.length(); j++) { //inner loop char ise,  i index deki char ile karsilastirir hepsini

                if (str.charAt(j) == str.charAt(i)) { //eger esit ise count 1 artar
                    count++;

                }

            }
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i) + "" + count; // toplamini sifirlanmadan eklememiz lazim
            }

        }
        System.out.println("result = " + result);
    }
}


