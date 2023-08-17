package Bit_Manupulations;

public class to_check_if_the_number_is_power_of_two {
    public static boolean power_of_two(int n) {
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(power_of_two(32));
    }
}
