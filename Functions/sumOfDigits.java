package Functions;
import java.util.*;

public class sumOfDigits {

    public static int SoD(int n){
        int Sum = 0 ;
        while(n!=0){
            int LastDigit = n%10;
            Sum = Sum + LastDigit;
            n=n/10;
        }
        return Sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Sum of digits of the given number is : " + SoD(num));

        sc.close();
    }
    
}
