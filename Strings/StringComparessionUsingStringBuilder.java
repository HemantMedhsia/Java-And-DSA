package Strings;

public class StringComparessionUsingStringBuilder {
    public static StringBuilder compress(StringBuilder sb) {
        StringBuilder newStr = new StringBuilder("");
        for(int i=0 ; i<sb.length() ; i++) {
            Integer count = 1;
            while(i<sb.length()-1 && sb.charAt(i)==sb.charAt(i+1)) {
                count ++;
                i++;
            }
            newStr.append(sb.charAt(i));
            if(count > 1) {
                newStr.append(count.toString());
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aaaaabbbbcccddf");
        System.out.println(compress(sb));
    }
}
