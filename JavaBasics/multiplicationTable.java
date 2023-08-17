import java.util.*;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want print table");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }

    }
}
