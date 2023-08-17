package OOPs;

public class copyConstructor {
    public static void main(String[] args) {
        student s1 = new student(null);
        s1.name = "Hemant" ;
        s1.password = "abcd";

        student s2 = new student(s1);
        s2.password = "xyz";
    }
}

class student {
    String name;
    int roll ;
    String password;

    // copy conustrctor
    student(student s1) {
        this.name = s1.name;
        this.roll = s1.roll ; 
    }
}
