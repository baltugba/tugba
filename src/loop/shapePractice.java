package loop;

public class shapePractice {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.print("#");

            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            System.out.println("#");
        }
    }

}
/*
#
 #
   #
     #
      #
       #
        #
 */