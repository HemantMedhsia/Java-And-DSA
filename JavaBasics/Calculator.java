import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the frist number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        System.out.println("enter the operator");
        char op = sc.next().charAt(0);

        switch(op){
            case'+' : System.out.println(num1 + num2);
                break;
            case'-' : System.out.println(num1 - num2);
                break;
            case'/' : System.out.println(num1 / num2);
                break;
            case'*' : System.out.println(num1 * num2);
                break;
            default : System.out.println("we are not so advance that time.");

    }
            //  this is the use of ternarry opeartor.
            
            // String var =  (num1+num2 > 6) ? "gooo" : "poooo" ; 
            // System.out.println(var);
        
    }
}
