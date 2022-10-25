package Square;
import Rectangle.Rectangle;

public class Square extends Rectangle  {


    public Square(double width, double height) {
        super(width, height);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    public static  void main(String[] args){
        Square square = new Square(10,10);
        System.out.println(square.Area());
    }
}
