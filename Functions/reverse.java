package Functions;
import java.util.*;

public class reverse {

    public static int rev(int n){
        int rev = 0;
        while(n!=0){
            int LastDigit = n%10;
            rev = rev*10 + LastDigit;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse.");
        int num = sc.nextInt();
        System.out.println("Reverse = " + rev(num));

        sc.close();
    }
    
}
