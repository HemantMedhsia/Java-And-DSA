package OOPs;

public class Abstraction_using_constructor {
    public static void main(String[] args) {
        Chicken h = new Chicken();
        h.eat();
        h.walk();
        System.out.println(h.color);
        
        
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    
    void changeColor() {
        color = " dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs.");
    }
}

class Chicken extends Horse {

    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("Walks on 2 legs.");
    }
}