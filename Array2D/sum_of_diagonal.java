package Array2D;

import java.util.Scanner;

public class sum_of_diagonal {
    public static int sumOfDiagonal(int arr[][]) {
        int sum =0;
        for(int i=0 ; i<arr.length ; i++) {
            sum += arr[i][i];

            sum += arr[i][arr.length-1-i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<arr.length ; i++) {
            for( int j=0 ; j<arr[0].length ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(sumOfDiagonal(arr));
    }
}
