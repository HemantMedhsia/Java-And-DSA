package Functions;
import java.util.*;

public class palindrome {

    public static boolean palindromeNum(int n) {
        int temp = n;
        int rev = 0;
        while(n!=0){
            int rem =n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        if(temp == rev){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enterr the number to check weather it is Palindrome or not.");
        int num = sc.nextInt();
        if(palindromeNum(num) == true){
            System.out.println("Givne number is a Palindrome.");
        }
        else{
            System.out.println("Givne number is not a Palindrome.");
        }

        sc.close();
        
    }
}
