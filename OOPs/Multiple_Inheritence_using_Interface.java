package OOPs;

public class Multiple_Inheritence_using_Interface {
    public static void main(String[] args) {
        Bear br = new Bear();
        br.eatsNonveg();
        br.eatsVeg();
    }
}

interface Harbi {
    void eatsVeg();

}

interface Omni {
    void eatsNonveg();

}

class Bear implements Harbi,Omni {
    public void eatsVeg() {
        System.out.println("Eating only veg things.");
    }

    public void eatsNonveg() {
        System.out.println("Eating only Non-veg things.");
    }
}
