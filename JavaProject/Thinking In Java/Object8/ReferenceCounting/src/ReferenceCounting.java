//: polymorphism/ReferenceCounting.java
// Cleaning up shared member objects.
//import static net.mindview.util.Print.*;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0)
            System.out.println("Disposing " + this);
    }

    public String toString() {
        return "Shared " + id;
    }

    protected void finalize() {
        if (refcount != 0)
            System.out.println("Error: object is not properly cleaned-up!");
    }

    public static long showCounter() {
        return counter;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }

    public String toString() {
        return "Composing " + id;
    }

    public static long showCounter() {
        return counter;
    }

//    protected void finalize() {
//        try {
//            super.finalize();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//}
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared)};
//        System.out.println(Shared.showCounter());
//        System.out.println(Composing.showCounter());
        for (Composing c : composing)
            c.dispose();
        new Composing(new Shared());
        System.gc();
        new Composing(new Shared());
        System.gc();
    }
} /* Output:
Creating Shared 0
Creating Composing 0
Creating Composing 1
Creating Composing 2
Creating Composing 3
Creating Composing 4
disposing Composing 0
disposing Composing 1
disposing Composing 2
disposing Composing 3
disposing Composing 4
Disposing Shared 0
*///:~
