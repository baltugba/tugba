package loop;

import java.util.Scanner;

public class forTest {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        String print ="";
        String star = "";

        int magaza;
        for(int i=1; i <=5 ;i++){
            System.out.println("magaza " + i + ": satisini giriniz");
            magaza= cn.nextInt();
            star = "";
            for (int j =1; j<=magaza/100;j++){
                star +="*";
            }
            print +="magaza"+i+" : "+star + "\n";
        }
        System.out.println(print);

    }


}
/*
Kullanıcıdan beş mağaza için bugünün satışlarını girmesini isteyen bir program yazın. Program
her mağazanın satışlarını karşılaştıran bir çubuk grafik görüntüleyin.
 Bir dizi yıldız işareti görüntüleyerek çubuk grafikte her çubuğu oluşturun.
Her yıldız işareti, 100 ABD doları tutarındaki satışı temsil etmelidir. İşte bir örnek
programın çıktısı:
1. mağaza için bugünün satışlarını girin: 1000 [Enter]
2. mağaza için bugünün satışlarını girin: 1200 [Enter]
Mağaza 3: 1800 için bugünün satışlarını girin [Enter]
Mağaza 4: 800 için bugünün satışlarını girin [Enter]
Mağaza 5: 1900 için bugünün satışlarını girin [Enter]
SATIŞ ÇUBUĞU TABLOSU
Mağaza 1: **
Mağaza 2: *
Mağaza 3: **
Mağaza 4: **
Mağaza 5: **
 */
