package OOPs;

public class superKeyword {
    public static void main(String[] args) {
        //Horse h = new Horse();
        //Animal a = new Animal();
	Vedansh v = new Vedansh();
        

    }
}

class Animal {

    Animal() {
        System.out.println("Animal Constructor is called now...");
    }

}

class Horse extends Animal {
    
    Horse() {
        
        System.out.println("Horse Constructor is called now...");
    }
}

class Vedansh extends Horse {

    Vedansh() {
	super();
	System.out.println("Vedansh is a horse now. ");
    }
}
