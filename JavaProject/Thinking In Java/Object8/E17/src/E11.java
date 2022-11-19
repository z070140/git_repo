//package polymorphism;

class Unicycle extends Cycle {
    public void go() {
        System.out.println("Unicycle go");
    }

    public void balance() {
        System.out.println("Unicycle balance()");
    }
}

class Bicycle extends Cycle {
    public void go() {
        System.out.println("Bicycle go");
    }

    public void balance() {
        System.out.println("Bicycle balance()");
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


public class E11 {
    public static void ride(Cycle c) {
        c.go();
    }

    public static void main(String[] args) {
//        ride(new Cycle());
//        ride(new Unicycle());
//        ride(new Bicycle());
//        ride(new Tricycle());
        Cycle c[] = {new Cycle(), new Unicycle(), new Bicycle(), new Tricycle()};
//        ((Cycle) c[0]).balance();
        ((Unicycle) c[1]).balance();
        ((Bicycle) c[2]).balance();
        try {
            ((Unicycle) c[3]).balance();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }
}