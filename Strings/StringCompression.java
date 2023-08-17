package Strings;

public class StringCompression {
    public static String compress(String str) {

        String newStr = "" ;
        
        for(int i=0 ; i<str.length() ; i++) {
            Integer Count = 1;

            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                Count++;
                i++;

            }
            newStr += str.charAt(i);
            if(Count > 1) {
                newStr += Count.toString();
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(compress("aaaaabbbbbbccd"));
    }
}
