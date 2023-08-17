package Bit_Manupulations;

public class count_number_of_setBits {
    public static int count_numberOfSetBits(int n) {
        int count = 0;
        while(n>0) {
            if((n & 1) != 0) {
                count++;
            }

            n=n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count_numberOfSetBits(32));
    }
}
