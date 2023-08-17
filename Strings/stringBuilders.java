package Strings;

public class stringBuilders {

    public static void main(String[] args) {
        // String builders are like String but they can not create a copy while changing in the current string.
        StringBuilder sb = new StringBuilder("Hello World ");
        for(char ch='a' ; ch<='z' ; ch++) {
            sb.append(ch);
        }
        System.out.println(sb.length());
        System.out.println(sb);
    }
    
}
