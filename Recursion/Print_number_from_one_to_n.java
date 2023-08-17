package Recursion;

public class Print_number_from_one_to_n {
    public static void printnum(int n) {
        if(n==1) {
            System.out.println(n);
            return;
        }
        
        printnum(n-1);
        System.out.println(n + " ");

    }
    public static void main(String[] args) {
        int num = 10;
        printnum(num);
    }
}
