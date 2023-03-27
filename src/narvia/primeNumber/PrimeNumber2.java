package narvia.primeNumber;

public class PrimeNumber2 {
    public static void main(String[] args) {
        int number =9;
        boolean isPrimeNum = true;

        for(int i = 2; i < number /2; i ++)
        {
            if(number%i==0){
                isPrimeNum= false;
                break;
            }

        }
        if(isPrimeNum){
            System.out.println(number+ " is a prime number");
        }
        else{
            System.out.println(number+ " is not a prime number");
        }

    }
    }



