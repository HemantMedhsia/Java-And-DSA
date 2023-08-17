package Recursion;

public class lastOccurence {
    public static int lastOcc(int arr[] , int key , int i , int len) {
        int x = len;
        if(x==i){
            return -1;
        }

        if(arr[x] == key) {
            return x;
        }

        return lastOcc(arr, key, i , len--);
    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int len = arr.length-1;
        System.out.println(lastOcc(arr, 5, 0 , len));
    }
}
