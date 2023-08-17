package Array2D;

import java.util.Scanner;

public class finding_max_in_2D_arrray {
    public static int Array2D(int arr[][]) {
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++) {
            for( int j=0 ; j<arr[0].length ; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
                
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
            for(int i=0 ; i<arr.length ; i++) {
                for( int j=0 ; j<arr[0].length ; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Max = " +Array2D(arr));
    
    }
}
