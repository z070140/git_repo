package polymorphism;

class Unicycle extends Cycle {
    public int wheels() {
        return 1;
    }

    public void go() {
        System.out.println("Unicycle go");
    }
}

class Bicycle extends Cycle {
    public int wheels() {
        return 2;
    }

    public void go() {
        System.out.println("Bicycle go");
    }
}

class Tricycle extends Cycle {
    public int wheels() {
        return 3;
    }

    public void go() {
        System.out.println("Tricycle go");
    }
}

class Cycle {
    public int wheels() {
        return 0;
    }

    public void go() {
        System.out.println("Cycle go");
    }
}


public class E03 {
    public static void ride(Cycle c) {
        c.go();
        System.out.println("Number of wheels: " + c.wheels());
    }

    public static void main(String[] args) {
        ride(new Cycle());
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}