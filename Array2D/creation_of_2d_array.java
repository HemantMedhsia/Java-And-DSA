package Array2D;
import java.util.*;

public class creation_of_2d_array {
    public static void Array2D(int arr[][] , int key) {
        for(int i=0 ; i<arr.length ; i++) {
            for( int j=0 ; j<arr[0].length ; j++) {
                if(arr[i][j] == key) {
                    System.out.print("key found at cell no " + "("  + i + "," + j + ")");
                    System.out.println();
                }
                
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int key = 9;
        Scanner sc = new Scanner(System.in);
            for(int i=0 ; i<arr.length ; i++) {
                for( int j=0 ; j<arr[0].length ; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            Array2D(arr, key);
            for(int i=0 ; i<arr.length ; i++) {
                for( int j=0 ; j<arr[0].length ; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

        
    }

}
