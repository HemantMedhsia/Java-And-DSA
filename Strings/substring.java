package Strings;
public class substring {
    public static String subStringFunction(String str , int si , int ei) {
        String substr = "";
        for(int i=si ; i<ei ; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "HemantKumarGupta";
        System.out.println(subStringFunction(str, 3, 8));

        // Builtin Stirng Function.
        System.out.println(str.substring(3,8));
    }
}
