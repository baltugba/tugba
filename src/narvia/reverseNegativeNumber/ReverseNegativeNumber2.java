package narvia.reverseNegativeNumber;

public class ReverseNegativeNumber2 {

    public static void main(String[] args) {

        reverseNum(-105);
    }
    public static void reverseNum(int num){
        if(num < 10 && num > 0){
            System.out.println(num);
            return;
        }else if (num > 0){
            System.out.print(num % 10);
            reverseNum(num / 10);

        }else {
            System.out.print( num % 10);
            reverseNum((num /10)* -1);

        }


    }
}
