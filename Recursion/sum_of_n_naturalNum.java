package Recursion;

class sum_of_n_naturalNum {
    public static int calcSum(int n) {
        if(n==1){
            return 1;
        }
        int Snm1 = calcSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }

    public static void main(String[] args) {
        int num =5;
        System.out.println(calcSum(num));
    }
}
