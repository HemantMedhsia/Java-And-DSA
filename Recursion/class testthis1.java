package Recursion;

class testthis1 {
    public static void main(String[] args) {
        Student s1 = new Student(111, "hemant", 50000f);
        Student s2 = new Student(112, "hemantk", 60000f);
        s1.Display();
        s2.Display();

        Student2 s3 = new Student2(111, "hemant", 50000f);
        Student2 s4 = new Student2(112, "hemantk", 60000f);
        s3.Display();
        s4.Display();
    }
}


class Student {
    int roll_no ;
    String name;
    float fee;
    Student(int roll_no , String name , float fee) {
        this.roll_no = roll_no;
        this.name = name;
        this.fee = fee;
    }

    void Display() {
        System.out.println(roll_no + " " + name + " " + fee);
    }
}

class Student2 {
    int roll_no ;
    String name;
    float fee;
    Student2(int r , String n , float f) {
        roll_no = r;
        name = n;
        fee = f;
    }

    void Display() {
        System.out.println(roll_no + " " + name + " " + fee);
    }
}

class Bike {
    final int speedlimit = 90;
    void run(){
        speedlimit=400;
    }
}

class Bike1 {
    final int speedlimit = 90;
    final void run(){
        System.out.println("running");
    }
}

    