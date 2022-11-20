

class Mouse extends Rodent {
    @Override
    public void move() {
        System.out.println("Mouse move()");
    }

    @Override
    public void eat() {
        System.out.println("Mouse eat()");
    }
}

class Gerbil extends Rodent {
    @Override
    public void move() {
        System.out.println("Gerbil move()");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil eat()");
    }
}

class Hamster extends Rodent {
    @Override
    public void move() {
        System.out.println("Hamster move()");
    }

    @Override
    public void eat() {
        System.out.println("Hamster eat()");
    }
}

abstract class Rodent {
    public abstract void move();

    public abstract void eat();
}

public class Manger {
    public static void main(String[] args) {
        Rodent[] rodents = {new Mouse(), new Gerbil(), new Hamster()};
        for (Rodent r : rodents) {
            r.eat();
            r.move();
        }
        new Rodent();
    }
}

