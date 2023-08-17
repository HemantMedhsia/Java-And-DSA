import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String input;
        do{

            System.out.println("Enter a number to calculate Factorial");
            int num = sc.nextInt();
            long fact = 1;
            while(num!=0){
                fact*=num;
                num--;
            }
            System.out.println("Factorial =" + fact);
            fact = 1;
            System.out.println("If you want to proceed again type 'Y' then Press Enter.");
            System.out.println("If you want to Exit then Press any key and hit Enter.");
            char input = sc.next().charAt(0);          
            if(input == 'Y' || input == 'y'){        
                    continue;       
            }else{        
                    break;     
            }
        }while(true);
        
    }
}
