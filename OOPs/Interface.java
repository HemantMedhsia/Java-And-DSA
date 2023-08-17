package OOPs;

public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves();

}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Running straight in all directions");
    }

}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println(" Up , Down , Left , Right");
    }

}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("One step in all directions");
    }
}
