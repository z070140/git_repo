package HomeWork;

public class T5_11 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Point p = new Point();
	p.setX(0);
	p.setY(1);
	System.out.println("x:" + p.getX() + " y:" + p.getY());
    }

}

class Point {
    int x = 0;
    int y = 0;

    public void setX(int x) {
	this.x = x;
    }

    public void setY(int y) {
	this.y = y;
    }

    public int getX() {
	return this.x;
    }

    public int getY() {
	return this.y;
    }

}