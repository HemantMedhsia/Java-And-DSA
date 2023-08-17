package OOPs;

public class getters_and_setters {
    public static void main(String[] args) {
        Room r = new Room();
        r.tables = 4;
        System.out.println(r.getDetails());
        r.key = 223;
        System.out.println(r.key);
        r.setDetails(8787);
        System.out.println(r.key);

    }
}

class Room {
    int tables;
    int chairs;
    int key;

    // getters
    int getDetails() {
        return tables;
        
    }

    // Setters.
    void setDetails(int key){
        this.key = key;
    }
}
