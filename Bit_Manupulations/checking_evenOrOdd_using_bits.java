package Bit_Manupulations;

public class checking_evenOrOdd_using_bits {
    public static String EvenOrOdd(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            return "Even";
        }
        else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(EvenOrOdd(7));
    }
}
