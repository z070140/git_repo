package polymorphism;

class Unicycle extends Cycle {
    public void go() {
        System.out.println("Unicycle go");
    }
}

class Bicycle extends Cycle {
    public void go() {
        System.out.println("Bicycle go");
    }
}

class Tricycle extends Cycle {
    public void go() {
        System.out.println("Tricycle go");
    }
}

class Cycle {
    public void go() {
        System.out.println("Cycle go");
    }
}


public class E01 {
    public static void ride(Cycle c) {
        c.go();
    }

    public static void main(String[] args) {
        ride(new Cycle());
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}