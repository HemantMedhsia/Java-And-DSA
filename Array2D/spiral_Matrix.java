package Array2D;

import java.util.Scanner;

public class spiral_Matrix {
    public static void spiral(int arr[][]) {
       int startRow = 0;
       int startCol = 0;
       int endRow = arr.length -1 ;
       int endCol = arr[0].length - 1;

       while(startRow <= endRow && startCol <= endCol) {
            // top boundry;
            for(int j=startCol ; j<=endCol ; j++){
                System.out.println(arr[startRow][j] + " ");
            }

            // right boundry;
            for(int j=startRow+1 ; j<=endRow ; j++) {
                System.out.println(arr[j][endCol] + " ");
            }

            // bottom boundry;
            for(int j=endCol-1 ; j>=startCol ; j--) {
                if(startRow==endRow){
                    break;
                }
                System.out.println(arr[endRow][j]  + " ");
            }

            // left boundry;
            for(int j=endRow-1 ; j>=startRow ; j--) {
                if(startCol==endCol){
                    break;
                }
                System.out.println(arr[j][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
       }
    }

    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<arr.length ; i++) {
            for( int j=0 ; j<arr[0].length ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        spiral(arr);
        sc.close();
    }
}
