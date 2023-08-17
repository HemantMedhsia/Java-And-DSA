package OOPs;


public class xyz {
    public static void main(String[] args) {
       Cat c1=new Cat();  
       System.out.println(c1.color);  
    }
    
}
abstract class Animal{
    String color;
    void walk(){
        System.out.println("Walking");
    }
    Animal(){
       color="brown";

        System.out.println("Constructor 1 is called");
    }
    void eat(){
        System.out.println("Anmial eats");
    }
}
class Dog extends Animal {
    Dog(){
        System.out.println("constructor 2 is called");
    }
    void changecolor(){
        color="dark brown";
    }
}
class Cat extends Dog{
    Cat(){
        System.out.println("Constructor 3 is called");
    }
    void changecolor(){
        color="Yellow";
    }

}
