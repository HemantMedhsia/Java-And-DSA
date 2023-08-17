package Sorting_Algorithem;
import java.util.*;

public class InbuiltSort {

    // this is a simple sorting technique 
    public static void inbultSort(int arr[]) {
        Arrays.sort(arr);
    }

    // this is a Index wise sorting technique.
    public static void inbultSort_withIndex(int arr[] , int si , int ei) {
        Arrays.sort(arr , si , ei);
    }

    // this is a reverseing technique for reversing an Array using Collection Frame work in java.
    public static void inbultSort_reverseArray(Integer arr[]) {
        Arrays.sort(arr , Collections.reverseOrder());
    }

    public static void main(String[] args) {
        int arr[] = {3,42,6,7,89,2,4,1,5};

        inbultSort(arr);
        for(int i = 1 ; i<arr.length ; i++) {
            System.out.println(arr[i]);
        }

        inbultSort_withIndex(arr , 0 , 4);
        for(int i = 1 ; i<arr.length ; i++) {
            System.out.println(arr[i]);
        }

        Integer arrC[] = {3,42,6,7,89,2,4,1,5};
        inbultSort_reverseArray(arrC);
    }
}
