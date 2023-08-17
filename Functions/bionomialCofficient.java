package Functions;
import java.util.*;

public class bionomialCofficient {
    public static int factorialF(int a){
        int fact = 1;
        for(int i = 1; i<=a ; i++){
            fact = fact * i;
        }
        return + fact;
    }

    public static int bioC(int n, int r){
        int n_fact = factorialF(n);
        int r_fact = factorialF(r);
        int nmr_fact = factorialF(n-r);
        int bc = n_fact/(r_fact*nmr_fact);
        return bc;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n : ");
        int n = sc.nextInt();

        System.out.println("Enter the r : ");
        int r = sc.nextInt();

        System.out.println("Bionomial Cofficent = " + bioC(n, r));
        System.out.println("factorial of "+ n + " = " + factorialF(n));

        sc.close();
    }
    
}
