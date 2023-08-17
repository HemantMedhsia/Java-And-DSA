package OOPs;

public class hybrid_Inheritance {
    public static void main(String[] args) {
        
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

class housefly extends Insect {
    
    void fastFlying() {
        System.out.println("I'm flying very fast. You can't catch me at all .");
    }
}

class cow extends Animal {

    void milk() {
        System.out.println(" I am giving milk to everyone.");
    }
}
