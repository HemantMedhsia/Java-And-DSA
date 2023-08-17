package Functions;
import java.util.*;

public class factorial {
    
    public static int factorialF(int a){
        int fact = 1;
        for(int i = 1; i<=a ; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("factorial = " + factorialF(num));

        sc.close();
    }
}
