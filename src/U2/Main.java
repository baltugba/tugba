package U2;

public class Main {

    public static void main(String[] args) {
        String str ="Dog Cat";
        str.replace("Cat","Dog");
        str.replaceFirst("Dog","tiger");

        System.out.println(str.endsWith("Dog"));
        System.out.println(str.startsWith("Dog"));

    }






}