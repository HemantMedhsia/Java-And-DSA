package OOPs;

public class constructorOverloading {
    public static void main(String[] args) {

        overload ov = new overload();
        overload ov2  = new overload("Hemant ", 22);
        overload ov3 = new overload(5);
        ov.overload();
        ov2.overload();
        ov3.overload();
    }
}

class overload {

    overload(){
        System.out.println(" I am Empty .");
    }

    overload(int x) {
        System.out.println("I have a value in the form of x" + x);
    }

    overload(String str , int y){
        System.out.println("I am little different thing with two different obj " + str + " " + y);
    }

    void overload() {
        System.out.println("I am a method.");
    }
}
