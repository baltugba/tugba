package U2;

public class AsalSayi {
    public static boolean asalMi(int sayi){
        for (int i = 2; i < sayi; i++){
            if(sayi %i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        for(int i= 2 ;i<1000;i++){
            if(asalMi(i)){
                System.out.println(i);
            }
        }

    }
}
/*
1 den 1000 e kadar olan sayilarda asal olanlari ekrana yazdirin
asal sayi= 1 e ve kendisinden baska hic bir sayiya bolunemeyen sayiya asal sayi denir
 */