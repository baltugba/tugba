package narvia.armstrongNumbers;


public class solutionFromMax {
    public static void main(String[] args) {
        System.out.println(ArmStrongNumber(456));
    }
    public  static  boolean ArmStrongNumber (int  num) {
        int a = 0,    b =0,    c= num;
        while(num>0){
            a=num%10;
            num/=10;
            b=b+(a*a*a);
        }
        if(c==b) {
            return true;
        }
        return false;
    }
}
