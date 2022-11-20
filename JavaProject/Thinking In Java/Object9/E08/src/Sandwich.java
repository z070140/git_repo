//: polymorphism/Sandwich.java
// Order of constructor calls.
//package polymorphism;
//import static net.mindview.util.System.out.println.*;

class Meal {
  Meal() { System.out.println("Meal()"); }
}

class Bread {
  Bread() { System.out.println("Bread()"); }
}

class Cheese {
  Cheese() { System.out.println("Cheese()"); }
}

class Lettuce {
  Lettuce() { System.out.println("Lettuce()"); }
}

class Lunch extends Meal {
  Lunch() { System.out.println("Lunch()"); }
}

class PortableLunch extends Lunch {
  PortableLunch() { System.out.println("PortableLunch()");}
}
interface FastFood {
  void rushOrder();
  void gobble();
}

class FastSandwich extends Sandwich implements FastFood{
  @Override
  public void rushOrder() {
    System.out.println("Rushing your sandwich order");
  }

  @Override
  public void gobble() {
    System.out.println("Chomp! Snort! Gobble!");
  }
}

public class Sandwich  extends PortableLunch {
  private Bread b = new Bread();
  private Cheese c = new Cheese();
  private Lettuce l = new Lettuce();
  public Sandwich() { System.out.println("Sandwich()"); }
  public static void main(String[] args) {
    new Sandwich();
  }
}

class E08 {
  public static void main(String[] args) {
    FastSandwich burger = new FastSandwich();
    System.out.println("Fires with that?");
    System.out.println("Super Size?");
    burger.rushOrder();
    burger.gobble();
  }
}

/* Output:
Meal()
Lunch()
PortableLunch()
Bread()
Cheese()
Lettuce()
Sandwich()
*///:~
