package U2;

public class finra {
    public static void main(String[] args) {

        for (int i = 0; i <100 ; i++) {

            if(i %3==0 && i%5==0){
                System.out.print("FINRA");
            }else if(i%3==0){
                System.out.print("FIN");

            }else if (i%5==0){
                System.out.print("RA");
            }else{
                System.out.print(i + " ");
            }


        }
    }
}
