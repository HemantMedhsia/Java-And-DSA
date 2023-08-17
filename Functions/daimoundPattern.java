package Functions;

public class daimoundPattern {
    public static void daimound(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int k=n*2-i ; k<=(n*2-1)+(i-1) ; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n ; i>=1 ; i--){
            for(int j=(n+1)-i ; j>=1 ; j--){
                System.out.print(" ");
            }
            for(int k=(n*2-3)+(i-1) ; k>=n*2-i ; k--){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        daimound(5);
    }
}
