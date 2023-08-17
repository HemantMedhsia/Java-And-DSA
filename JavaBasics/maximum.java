import java.util.*;
public class maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if((num1>num2) && (num1>num3)){
            System.out.println(num1 + "is Grater");
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2 + " is Grater");
        }
        else{
            System.out.println(num3 + " is Grater");
        }
    }
    
}
