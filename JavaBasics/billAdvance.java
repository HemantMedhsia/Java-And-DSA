import java.util.*;
public class billAdvance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the New Mart Shop");
        
        // (__)
        // |  |\
        // |  ||
        // |  ||
        // |__||
        // |  |
        // |  |
        // |  |
        // |  | -=New Mart Shop=-263
        // |__|
        // \||/
        //  \/ 
        System.out.println("Price of one pen is : 10$");
        System.out.println("Price of one pencil is : 5$");
        System.out.println("Price of one Eraser is : 3$");
        System.out.println("How many Pens you want to purchase");
        int pen = sc.nextInt();
        int sum1 = pen * 10;
        System.out.println("How many Pencil you want to purchase");
        int pencil = sc.nextInt();
        int sum2 = pencil * 5;
        System.out.println("How many to Eraser you want to purchase");
        int eraser = sc.nextInt();
        int sum3 = eraser * 3;
        System.out.println("total cost of pens = " + sum1);
        System.out.println("total cost of pencils = " + sum2);
        System.out.println("total cost of Eraser = " + sum3);
        System.out.println("Your total purchasing Bill is : " + (sum1+sum2+sum3));

    }
}
