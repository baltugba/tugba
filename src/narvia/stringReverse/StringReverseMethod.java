package narvia.stringReverse;



public class StringReverseMethod {

    public static void main(String[] args) {

        System.out.println(reverse("tugba"));
    }

    public static String reverse(String str){
        String reverse= "";
        for(int i=str.length()-1; i>=0;i--){
            reverse += str.charAt(i);
        }
        return reverse;

    }
}
