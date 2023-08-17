package Array;
public class searching_largest_element_in_array {

    // this is the function for finding the gratest value of the arrays.
    public static int largest(int arr[]){
        int len = Integer.MIN_VALUE; //storing the -infinite value.
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>len){
                len=arr[i];
            }
        }
        return len;
    }

    // this is the function of finding the smallest value of the arrays.
    public static int smallest(int arr[]){
        int len = Integer.MAX_VALUE; //storing the +infinite value.
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]<len){
                len=arr[i];
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int marks[] = {2,4,5,1,9,3};
        System.out.println("Largest element present in array : " + largest(marks));
        System.out.println("Smallest element present in array : " + smallest(marks));
    }
}
