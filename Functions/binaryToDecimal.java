package Functions;
import java.util.*;

public class binaryToDecimal {
    public static int btd(int num){
        int pow = 0;
        int decdigit = 0;
        while(num!=0){
            int lastdigit = num%10;
            decdigit = decdigit + lastdigit * (int)Math.pow(2,pow);
            pow++;
            num = num/10;
        }
        return decdigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binaryNum = sc.nextInt();
        System.out.println(btd(binaryNum));
        sc.close();
    }
}
