// Enter the cost of 3 item from the user ( using float data type) a pencil, a pen , a Eraser.
// You have to output the total cost of the item back to the user as there bill. 
// Add on : You can also trying adding 18% gst tax to the item in the bill as an advanced problem.

import java.util.*;
public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Pencil = sc.nextFloat();
        float Pen = sc.nextFloat();
        float Eraser = sc.nextFloat();
        
        float Bill = Pencil+Pen+Eraser;
        System.out.println("Total Bill " + Bill);

        // with 18% GST

        float withGST = (float) (Bill+(Bill * 0.18));
        System.out.println("your Bill with the GST: " + withGST);
    }
    
}
