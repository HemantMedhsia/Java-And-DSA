package Strings;

import java.util.Scanner;

public class input_output_of_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // This sc.next() function is used to print single word of a string.
        String str = sc.next();

        // This sc.nextLine() function is used to print complete line of a string.
        String str2 = sc.nextLine();
        
        // Output of the String str.
        System.out.println(str);
        System.out.println(str2);
    }
}
