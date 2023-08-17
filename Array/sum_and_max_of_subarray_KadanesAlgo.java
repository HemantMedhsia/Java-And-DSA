package Array;

public class sum_and_max_of_subarray_KadanesAlgo {
    public static int Kadanes(int arr[]) {
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            currSum = currSum + arr[i];
            if(currSum <0){
                currSum = 0;
            }
            if(currSum > max){
                max = currSum;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(Kadanes(num));
    }
}
