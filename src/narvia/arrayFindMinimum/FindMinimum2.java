package narvia.arrayFindMinimum;

public class FindMinimum2 {

    public static int findMinNum(int[]arr){
        int min=arr[0];//assuming that 1. element Id MINIMUM
        for (int i = 1; i <arr.length ; i++) { //WE ARE STARTING NUM 1 BECAUSE WE ALREADY GIVE 0
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[]={10,80,32,-10};

        System.out.println("findMinNum(arr) = " + findMinNum(arr));
    }
}
