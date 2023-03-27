package test;

public class unique3 {

    public static String unique(String str) {
        String temp = "";
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(i+"1==."+str.charAt(i));
            for (int j = 0; j < str.length(); j++) {
                System.out.println(j+"==>2.st"+str.charAt(j));

            }

        }
return temp;

    }

    public static void main(String[] args) {
        String str ="Abcde";
        unique(str);
    }
}


