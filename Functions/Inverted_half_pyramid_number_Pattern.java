package Functions;

import java.util.Scanner;

public class Inverted_half_pyramid_number_Pattern {
    public static void inverted(int n){
        for(int i=n ; i>=1 ; i--){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int row = sc.nextInt();
        inverted(row);

        sc.close();
    }
}
