//: polymorphism/shape/Square.java
package polymorphism.shape;
//import static net.mindview.util.Print.*;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
} ///:~
