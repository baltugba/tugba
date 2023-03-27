package U2;

import java.util.Scanner;

public class armstrongSayisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi=input.nextInt();
        System.out.println("Basamak sayisi:");
        int basamakSayisi=input.nextInt();

        int geciciSayi= sayi;
        int toplam=0;

        do{
            int basamakDegeri=geciciSayi%10; //1634 ise %10 yaparsak rakam 4 u aliriz
            geciciSayi=geciciSayi/10;  //geciciSayi /=10; da diyebiliriz
            toplam+=Math.pow(basamakDegeri,basamakSayisi);


        }while(geciciSayi>0);
        if(sayi==toplam){
            System.out.println("Bu sayi bir armstrong sayisidir");
        }
        else{
            System.out.println("Bu sayi bir armstrong saysisi degildir");
        }


    }
}
