package U2;

import java.util.Scanner;

public class hesMakine {
    public static int cikarma(int a, int b){
        return (a-b);

    }
    public static double bolme( int a,int b){
        return ((double)a/b );
    }
    public static int toplama(int a,int b,int c){
        return (a+b+c);
    }
    public static int carpma(int a,int b,int c){
        return a*b*c;
    }
    public static int carpma(int a,int b){
        return a*b;
    }
    public static int toplama(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String islemler = "1. toplama islemi \n"
                +"2.cikartma islemi\n"
                +"3. carpma islemi \n"
                +"4.bolme islemi \n"
                +"cikis icin q ya basin.";

        System.out.println("___________________________________");

        System.out.println(islemler);
        System.out.println("_____________________________________");

        while (true){
            System.out.println("Islemi seciniz");
            String islem = scanner.nextLine();

            if(islem.equals("q")){
                System.out.println("Programdan cikiliyor");
            }
            else if(islem.equals("1")){
                System.out.println("Kac deger toplayacaksiniz?( iki veya uc");
                int kacSayi=scanner.nextInt();
                if(kacSayi == 2){
                    System.out.println("a:");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("girilen sayilarin toplamlari:"+ toplama(a,b));

                }
                else if(kacSayi==3){

                }
                else{
                    System.out.println("bunun icin uygun method bulunamadi");
                }
            }



        }
    }
}
