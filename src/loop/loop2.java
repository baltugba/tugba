package loop;

public class loop2 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if (i == 4) {


                continue;
            }
            System.out.println(i + " ");
        }
        System.out.println("____________________________");

        for (int i = 10; i < 21; i++) {

            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("________________________________");

        for(char i='A'; i<='G'; i++){
            if(i=='B' || i=='E')
                continue;
            System.out.println(i);
        }
    }
}