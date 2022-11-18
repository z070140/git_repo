package reusing;

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}

//class ChessWithoutDefCtor extends BoardGame{
//    ChessWithoutDefCtor(){
//        System.out.println("ChessWithoutDefCtor constructor");
//    }
//}

public class Chess extends BoardGame {
    Chess() {
        super(47);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
