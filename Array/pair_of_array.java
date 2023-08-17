package Array;
public class pair_of_array {
    public static void pair(int arr[]){
        for(int i=0 ; i<arr.length ; i++) {
            for(int j=i+1 ; j<arr.length ; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int marks[] = {2,4,6,8,10};
        pair(marks);
    }
}
