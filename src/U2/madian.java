package U2;

public class madian {
    public static void main(String[] args) {



        int a = 10;
        int b = 15;
        int c = 20;
        boolean bIsMedian =(b > a && b < c) || (b < a && b > c);
        boolean aIsMedian =(a > b && a < c) || (a < b && a > c);
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if(aIsMedian ) {
            System.out.println(a + " is the median number");
        }
        if(bIsMedian){
            System.out.println(b + " is the median number");
        }
        if(cIsMedian){
            System.out.println(c + " is the median number");
        }



    }




}
