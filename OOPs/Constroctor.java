package OOPs;

public class Constroctor {
    public static void main(String[] args) {
        bank b = new bank();
        b.vedansh();
        
    }
}

class bank {
    bank() {
        System.out.println("constructor is called....");
    }

    void vedansh() {
        System.out.println("My name is Vedansh Tiwari.");
    }
}
