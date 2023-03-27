package narvia.sumOfDigits;
//String -- sum of digits in a string
//Write a method that can return the sum of the digits in a string

public class sumOfDigits1 {

        public static void main(String[] args) {

            String str = "ab34c3";
            System.out.println(sum(str));
        }

        public static int SumOfStringInt(String x){
            int sum =0;
            for(int i = 0; i < x.length(); i++){
                char temp =x.charAt(i);
                if(Character.isDigit(temp)){
                    int a = Integer.parseInt(String.valueOf(temp));
                    sum = sum + a;
                }
            }

            return sum;
        }
        public static int sum(String s){
            int sum = 0;
            for (char each : s.toCharArray()){
                if(Character.isDigit(each)){
                    sum += Integer.parseInt(""+each);//convert to char a number// parse method only accept string o yuzdenconcate""
                }
            }
            return sum;
        }
    }

