package Array;

import java.util.*;

public class linearSrearchInArray {
    public static int linear(int grades[] , int key){
        for(int i=0 ; i<grades.length ; i++){
            if(grades[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,5,6,7,9,12,34,56,78,43,67,89};
        int key = sc.nextInt();
        int res = linear(arr, key);
        if(linear(arr, key)==-1){
            System.out.println("Key Not Found. ");
        }
        else{
            System.out.println("key found on the index number : " + res);
        }

        sc.close();
        
    }
}
