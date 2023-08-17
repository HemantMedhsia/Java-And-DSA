package Recursion;

public class factorial_using_recursion {

    public static int fact(int n) {
        if(n==0) {
            return 1;
        }
        int fact = n * fact(n-1);
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
