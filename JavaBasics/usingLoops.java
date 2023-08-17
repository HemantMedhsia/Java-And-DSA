public class usingLoops {
    public static void main(String[] args) {
        int num=1;
        // while Loop
        while(true){
            if(num == 3){
                break;
            }

            for(int i=1;i<=5;i++){
                for(int k=4;k>=i;k--){
                    System.out.print("   ");
                }

                for(int j=1;j<=i;j++){
                    System.out.print("_@_   ");
                }
                System.out.print("\n");
            }
            
            num++;
        }
            for(int l=1;l<=4;l++){
                for(int m=1;m<=3;m++){
                    System.out.print("   ");
                }

                for(int n=1;n<=3;n++){
                    System.out.print("!#!"); 
                }
                System.out.print("\n");
            }
    }
}
