package narvia.primeNumber;

public class PrimeNumber {
    public static void main(String[] args) {

        isPrime(7);
        isPrime(12);
        isPrime(30);
        isPrime(11);
    }



    public static void isPrime( int num){

        boolean isPrime = true;


        for(int i = 2; i < num; i ++){// it will check givin number between 2
            if(num % i== 0){
                isPrime= false;
                break;
            }
        }
        if(num <=1){
            isPrime= false;
        }

   if(isPrime){
        System.out.println(num + " is a prime number");
    }else{
        System.out.println(num+ " is not a prime number");
    }



}


    }


    /*

1. Numbers -- Prime Number
Write a method that can check if a number is
prime or no
     */

