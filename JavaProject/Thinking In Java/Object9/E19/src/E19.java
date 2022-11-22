import java.util.Random;

interface Game{

    boolean play();
}

interface GameFactory{
    Game getGame();
}

class Coin implements Game{
    private static final int RES = 2;
    private int plays =0;

    @Override
    public boolean play() {
        System.out.println("Coin :" + plays);
        return ++plays!=RES;
    }
}

class CoinFactory implements GameFactory{

    @Override
    public Game getGame() {
        return new Coin();
    }
}

class Dice implements Game {
    private static final int RES = 7;
    private int plays = 1;
    @Override
    public boolean play() {
        System.out.println("Dice :"+plays);
        return ++plays!=RES;
    }
}

class DiceFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Dice();
    }
}

public class E19 {
    public static void playGame(GameFactory factory){
        Game game = factory.getGame();
        while(game.play()){}
    }
    public static void main(String[] args) {
        playGame(new CoinFactory());
        playGame(new DiceFactory());
    }
}
