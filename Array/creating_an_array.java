package Array;

public class creating_an_array {
    public static void arr(int marks[]){
        for(int i=0 ; i<marks.length ; i++){
            System.out.print(marks[i] + " ");
        }

        marks[0] = 1234;
        System.out.println("total length = " + marks.length);
    }

    public static void main(String[] args) {
        int m[] = new int[20];
        for(int i=0 ; i<m.length ; i++){
            m[i]=i+5;
        }
        arr(m);
        for(int i=0 ; i<m.length ; i++){
            System.out.print(m[i] + " ");
        }

    }
}
