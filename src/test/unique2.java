package test;

public class unique2 {
    public static void main(String[] args) {
        int[]numbers={1,2,3,4,4,5,6,6,7};

        for (int i = 0; i < numbers.length; i++) {
            boolean isUnique=true;
            for (int j = 0; j < numbers.length; j++) {
                if(i!= j && numbers[i]==numbers[j]){
                    isUnique=false;
                    break;

                }

            }
            if(isUnique){
                System.out.print(numbers[i]+"");
            }

        }
    }
}
