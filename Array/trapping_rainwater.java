package Array;

public class trapping_rainwater {
    public static int rainwater(int arr[]) {
        int rainwaterSum = 0;
        int weidth = 1;
        int leftmax[] = new int[arr.length];
        int rightmax[] = new int[arr.length];
        leftmax[0] = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            if(leftmax[i-1] >= arr[i]){
                leftmax[i] = leftmax[i-1];
            }
            else{
                leftmax[i] = arr[i];
            }
        }

        rightmax[arr.length -1] = arr[arr.length - 1];
        for(int i=(arr.length-1) ; i>0 ; i--){
            if(rightmax[i] < arr[i-1]){
                rightmax[i-1] = arr[i-1];
            }
            else{
                rightmax[i-1] = rightmax[i];
            }
        }

        for(int i=0 ; i<arr.length ; i++){
           int minimum = Math.min(rightmax[i], leftmax[i]);
            rainwaterSum += (minimum - arr[i]) * weidth;
        }
        return rainwaterSum;
    }
    
    public static void main(String[] args) {
        int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(rainwater(height));
    }
}
