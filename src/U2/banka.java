package U2;

import java.util.Scanner;

public class banka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bakiye =1000;
        String islemler= "1.Islem :Bakiye ogrenme\n"
                + "2.islem : Para Cekme\n"
                + "3.Islem: Para yatirma\n"
                +"cikis icin q ya basin";

        System.out.println("***************************");

        System.out.println(islemler);

        System.out.println("***************************");

        while(true){
            System.out.println("islemi seciniz");
            String islem =input.nextLine();

            if(islem.equals("q")){
                System.out.println("Programdan cikiliyor");
                break;

            }else if(islem.equals("1")){
                System.out.println("Bakiyeniz" + bakiye );

            }else if(islem.equals("2")){
                System.out.println("cekmek istediginiz tutar:");
                int tutar=input.nextInt();
                input.nextLine();

                if(bakiye-tutar <0){
                    System.out.println("Yetreli bakiye yok.Bakiyeniz:" + bakiye);
                }
                else{
                    bakiye=tutar;
                    System.out.println("Yeni bakiyeniz");
                }

            }else if(islem.equals("3")){
                System.out.println("Yatirmak istediginiz tutar");
                int tutar=input.nextInt();
                input.nextLine();
                bakiye+=tutar;
                System.out.println("Yeni bakiyeniz" + bakiye);




            }
            else{
                System.out.println("Gecersiz islem");
            }


        }




    }
}
/*
islemeler
1. islem: bakiye ogrenme
2.islem:para cekme
3.islem:para yatirma
cokis:q
 */