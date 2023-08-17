package Array;

public class Binary_search {
    public static int b_search(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = (start + end)/2;

            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid +1;
            }
            else{
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int marks[] = {2,4,6,12,13,45,67,98,121};
        System.out.println(b_search(marks, 6 ));
    }
}
