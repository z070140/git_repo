//: polymorphism/shape/Circle.java
package polymorphism.shape;
//import static net.mindview.util.Print.*;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
} ///:~
