package Strings;

public class Checking_palindrome_string {
    public static boolean palindrom(String str) {
        for(int i=0 ; i<str.length()/2 ; i++) {
            int n = str.length()-1;
            if(str.charAt(i) != str.charAt(n-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrom("madam"));
    }
}
