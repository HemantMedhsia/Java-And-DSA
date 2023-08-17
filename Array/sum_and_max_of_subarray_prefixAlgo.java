package Array;

public class sum_and_max_of_subarray_prefixAlgo {
    public static int prefix(int arr[]){

        int prefix[] = new int[arr.length];
        int max = Integer.MIN_VALUE;
        prefix[0] = arr[0];
        int currSum = 0;

        // System.out.println(prefix[0]);
        for(int i=1 ; i<prefix.length ; i++){
            prefix[i] = prefix[i-1] + arr[i];
            // System.out.println(prefix[i]);
        }

        for(int i=0 ; i<arr.length ; i++) {
            int start = i;
            for(int j=i ; j<arr.length ; j++) {
                int end = j;
                currSum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(currSum > max) {
                    max = currSum;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int number[] = {1,2,-1};
        System.out.println(prefix(number));
    }
}
