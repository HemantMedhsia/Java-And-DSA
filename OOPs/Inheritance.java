package OOPs;

public class Inheritance {
public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
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
