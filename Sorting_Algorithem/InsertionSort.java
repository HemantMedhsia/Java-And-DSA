package Sorting_Algorithem;
public class InsertionSort {
    public static void insertion(int arr[]) {
        for(int i=1 ; i<arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;

            // finding out the correct position to insert..
            while(prev>=0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,3,7,2,5,8,1,4};
        insertion(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
