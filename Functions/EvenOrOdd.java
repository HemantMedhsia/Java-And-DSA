package Functions;
import java.util.*;

public class EvenOrOdd {

    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check weather it is Even or Odd");
        int num = sc.nextInt();
        if(isEven(num) == true){
            System.out.println("Given number is Even.");
        }
        else{
            System.out.println("Given number is Odd.");
        }

        sc.close();
        
    }
    
}
