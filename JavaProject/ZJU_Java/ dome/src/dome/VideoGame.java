package dome;

public class VideoGame extends Item {
    private int numberOfPlayers;

    public static void main(String[] args) {

    }

    public VideoGame(String title, int playingTime, boolean gotIt,
	    String comment, int number) {
	super(title, playingTime, gotIt, comment);
	numberOfPlayers = number;
	// TODO Auto-generated constructor stub
    }

    @Override
    public void print() {
	System.out.print("VideoGame");
	super.print();
    }

}
