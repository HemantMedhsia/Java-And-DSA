package Functions;
import java.util.*;
public class multiply {
    // Formal Argument.
    public static int multiplyF(int a, int b){
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // Actual Argument.
        int product = multiplyF(num1, num2);
        System.out.println(product);

        sc.close();
    }
    
}
