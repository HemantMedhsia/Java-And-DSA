// using no return value with parameter .

// package Functions;
// import java.util.*;

// public class sumF {
//     public static void sum(int a , int b){
//         int add = a+b;
//         System.out.println(add);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         sum(num1,num2);
//     }
// }

// using with return value and parameter.

package Functions;
import java.util.*;

public class sumF {
    public static int sum(int a , int b){
        int add = a+b;
        return add;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the frist number : ");
        int num1 = sc.nextInt();
        System.out.println("enter the second number : ");
        int num2 = sc.nextInt();
        int add=sum(num1,num2);
        System.out.print(add);

        sc.close();
    }
}
