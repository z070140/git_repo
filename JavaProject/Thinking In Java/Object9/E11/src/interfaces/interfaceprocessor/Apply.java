//: interfaces/interfaceprocessor/Apply.java
package interfaces.interfaceprocessor;
//import static net.mindview.util.Print.*;

public class Apply {
  public static void process(Processor p, Object s) {
    System.out.println("Using Processor " + p.name());
    System.out.println(p.process(s));
  }
} ///:~
