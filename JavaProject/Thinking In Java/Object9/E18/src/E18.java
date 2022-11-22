interface Cycle {
    void ride();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("Unicycle ride");
    }
}

class UnicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}


class Bicycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("Bicycle ride");
    }
}

class BicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("Tricycle ride");
    }
}

class TricycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class E18 {
    public static void gogogo(CycleFactory cycleFactory) {
        Cycle cycle = cycleFactory.getCycle();
        cycle.ride();
    }

    public static void main(String[] args) {
        gogogo(new UnicycleFactory());
        gogogo(new BicycleFactory());
        gogogo(new TricycleFactory());
    }
}
