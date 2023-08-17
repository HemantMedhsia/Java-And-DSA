package Functions;
import java.util.*;

public class AverageOfThreeNumber {
    
    public static int Average(int a , int b , int c){
        int avg=(a+b+c)/3;
        return avg;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the frist number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number");
        int num3 = sc.nextInt();
        System.out.println("Average = " + Average(num1, num2, num3));

        sc.close();
    }

}
