package ozan;

public class FindMinimum {

    public static int findMinNimner(int arr[]){
        int tempMin= arr[0];
        for(int item :arr){
            if(tempMin>item){//5>2,2>1== temp =1
                tempMin=item;
            }
        }
        return tempMin;
    }
    public static void main(String[] args) {
        int arr[]={5,2,1,4};
        int resultMinNumber = findMinNimner(arr);
        System.out.println(resultMinNumber);
    }
}
