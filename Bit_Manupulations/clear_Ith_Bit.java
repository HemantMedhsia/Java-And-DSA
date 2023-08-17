package Bit_Manupulations;

public class clear_Ith_Bit {
    public static int clearIthBit(int n , int i) {
        int bitMask = ~(1<<i);
        return n & bitMask ;
    }

    public static void main(String[] args) {
        System.out.println(clearIthBit(15, 3));
    }
}
