package dome;

public class CD extends Item {

    private String artist;
    private int numofTracks;

    public CD(String title, String artist, int numofTracks, int playingTime,
	    String comment) {
	super(title, playingTime, false, comment);
//        this.title = title;
	this.artist = artist;
	this.numofTracks = numofTracks;
//	this.playingTime = playingTime;
//
//	this.comment = comment;
    }

//    @Override
    public boolean equals(CD obj,int i) {
	// TODO Auto-generated method stub
	CD ccCd = (CD) obj;
	return artist.equals(ccCd.artist);
    }

    public static void main(String[] args) {
	CD cd = new CD("a", "b", 2, 2, "...");
	CD cd1 = new CD("a", "b", 2, 2, "...");
	System.out.println(cd.equals(cd1));
//	
    }

//    public void print() {
//        System.out.println("CD:"+title+":"+artist);
//    }
}
