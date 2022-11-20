

class Mouse implements Rodent {
    @Override
    public void move() {
        System.out.println("Mouse move()");
    }

    @Override
    public void eat() {
        System.out.println("Mouse eat()");
    }
}

class Gerbil implements Rodent {
    @Override
    public void move() {
        System.out.println("Gerbil move()");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil eat()");
    }
}

class Hamster implements Rodent {
    @Override
    public void move() {
        System.out.println("Hamster move()");
    }

    @Override
    public void eat() {
        System.out.println("Hamster eat()");
    }
}

interface Rodent {
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
//        new Rodent();
    }
}

