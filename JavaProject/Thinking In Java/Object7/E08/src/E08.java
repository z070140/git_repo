class Base {
    Base(String s) {
        System.out.println("Base constructor: " + s);
    }
}

class Derived extends Base {
    Derived() {
        super("How to use WithoutDefCtor ");

    }

    Derived(String s) {
        super(s);
    }
}

public class E08 {
    public static void main(String[] args) {
        Derived d = new Derived();
        System.out.println("-----------");
        Derived d2 = new Derived("Hi");
    }

}
