package loop;

public class test9 {
    public static void main(String[] args) {
        String name= "   chuck norris ";
        System.out.print(name.toUpperCase().charAt(3)+".");
        System.out.print(name.toUpperCase().charAt(9)+".");

        System.out.println("_____________________________");

        for(char ch='A'; ch <= 'D'; ch++){
            if(ch=='C'){
                continue;
            }
            System.out.println(ch + " ");
            if(ch=='B'){
                break;
            }
        }
    }
}
