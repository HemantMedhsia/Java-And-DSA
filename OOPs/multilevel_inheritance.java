package OOPs;

public class multilevel_inheritance {
    public static void main(String[] args) {
        Insect bug = new Insect();
        bug.eat();
    }
}

class Animal {

    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breaths");
    }
}

// Derived class

class Fish extends Animal {

    int fins;
    int egg;

    void swim() {
        System.out.println("I am a good swimmer.");
    }
}

// Derived class 

class Insect extends Fish {

    int small;

    void fly() {
        System.out.println("I am a Insect and I am flying .");
    }
}