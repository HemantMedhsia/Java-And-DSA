package Functions;
import java.util.*;

public class primeNumberOptimize {
    public static boolean primenum(int n){
        for(int i=2;i<= Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n){
        int count = 0;
        for(int i=1 ; i<=n ; i++){
            if(primenum(i)){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("totl = " + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeInRange(n);

        sc.close();
    }

}
