package Array;

public class reversse_an_array {
    public static void reverse(int arr[]) {
        int start = 0 , end = arr.length-1;
        int mid = (int)(start + end)/2 , temp ;
        while(start<=mid){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int marks[] = {2,3,4,6,8,12,15,20};
        for(int i=0 ; i<marks.length ; i++){
            System.out.print(marks[i]  +   " ");
        }
        System.out.println();
        reverse(marks);
        for(int i=0 ; i<marks.length ; i++){
            System.out.print(marks[i]  +   " ");
        }
        
    }
}
