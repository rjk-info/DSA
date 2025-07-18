public class _7Interface {
    public static void main(String[] args) {
        Queen q = new Queen() ;
        q.moves();
    }
}



interface ChessPlayer {
    void moves() ;
}

class Queen implements ChessPlayer {
    
    public void moves() {
        System.out.println("up, down, left, right, diagonal");
    }
}

class Rook implements ChessPlayer {
    
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class king implements ChessPlayer {
    
    public void moves() {
        System.out.println("up, down, left, right, diagonal(by 1 step)");
    }
}