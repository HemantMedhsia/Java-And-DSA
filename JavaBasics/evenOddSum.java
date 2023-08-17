import java.util.Scanner;

public class evenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int even = 0;
        int odd = 0;

        while(num!=0){
            int rem = num%10;
            if(rem%2==0){
                even = even + rem;
            }
            else{
                odd  = odd + rem;
            }

            num = num/10;
        }

        System.out.println("Sum of total number of even digits are " + even);
        System.out.println("Sum of total number of odd digits are " + odd);
    }
    
}
