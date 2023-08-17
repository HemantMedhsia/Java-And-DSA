package Array;

public class best_time_to_buy_and_sell {

    public static int buy_and_sell(int arr[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxsum = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(buyPrice < arr[i]){
                int profit = arr[i] - buyPrice;
                maxsum = Math.max(maxsum , profit);
            }
            else{
                buyPrice = arr[i];
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int stocks[] = {7,1,5,3,6,4};
        System.out.print(buy_and_sell(stocks));
    }
}
