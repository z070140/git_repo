package polymorphism.shape;

public class Line extends  Shape {
    @Override
    public void draw() {
        System.out.println("Line.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Line.erase()");
    }

    @Override
    public void printSomething() {
        System.out.println("Line.printSomething()");
    }
}

