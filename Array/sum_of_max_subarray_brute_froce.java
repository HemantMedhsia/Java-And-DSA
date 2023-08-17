package Array;

public class sum_of_max_subarray_brute_froce {
    public static int max_subarray(int arr[]) {
        int currentSum = 0;
        int max_sum = Integer.MIN_VALUE;


        for(int i=0 ; i<arr.length ; i++){
            for(int j=i ; j<arr.length ; j++){
                for(int k=i ; k<=j ; k++){
                    System.out.print(arr[k]);
                    currentSum += arr[k];
                }
                if(currentSum>max_sum){
                    max_sum = currentSum;
                    
                }
                currentSum = 0;
                System.out.println();
            }
            System.out.println();
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int marks[] = {3,6,7,3,7};
        System.out.println(max_subarray(marks));

    }
}
