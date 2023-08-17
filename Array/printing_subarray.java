package Array;

public class printing_subarray {
    public static void subarray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i ; j<(arr.length) ; j++){
                for(int k=i ; k<=j ; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int marks[] = {2,3,4,5,6};
        subarray(marks);
    }
}
