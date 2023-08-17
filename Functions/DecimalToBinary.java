package Functions;
import java.util.*;

public class DecimalToBinary {
    public static int DtB(int num){
        int pow=0;
        int rem;
        int binDig=0;
        while(num!=0){
            rem=num%2;
            binDig = binDig + (rem * (int)Math.pow(10,pow));
            pow++;
            num=num/2;
        }
        return binDig;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int DeciDig = sc.nextInt();
        System.out.println(DtB(DeciDig));

        sc.close();
    }
}
