package loop;

public class StringReverse {
    public static void main(String[] args) {
        String str = "tugba";
                    //01234 index num

        String reverse ="";

        for (int i = str.length()-1; i >=0 ; i--) {//last indexden baslar zero(index)e kadar harfleri alir
         //   System.out.println(str.charAt(i)); //charat find characters
reverse +=str.charAt(i);
            
        }
        System.out.println(reverse);
    }

}
