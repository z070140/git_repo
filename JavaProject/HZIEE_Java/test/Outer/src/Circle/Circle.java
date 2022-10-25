package Circle;

public class Circle {
    double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public class Draw {
        public void drawShape() {
            System.out.println("drawshape");
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Circle.Draw draw = circle.new Draw();
        draw.drawShape();

    }

}

