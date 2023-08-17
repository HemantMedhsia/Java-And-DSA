package Sorting_Algorithem;
public class countingSort {
    public static void counting(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for(int i=0 ; i<arr.length ; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for(int i=0 ; i<count.length ; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }   
    }

    public static void main(String[] args) {
        int arr[] = {3,42,6,7,89,2,4,1,5};
        counting(arr);
        for(int i = 1 ; i<arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
