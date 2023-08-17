package Recursion;

public class Print_number_from_n_to_one {

    public static void printnum(int n) {
        if(n==1) {
            System.out.println(n);
            return;
        }
        
        System.out.println(n + " ");
        printnum(n-1);
    }
    public static void main(String[] args) {
        int num = 10;
        printnum(num);
    }
}
