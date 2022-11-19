import java.util.Random;

class A {
    private static Random rand = new Random(47);
    private final int a = rand.nextInt(20);

    A() {
        System.out.println(a);
    }
}

class B {
    private static Random rand = new Random(47);
    private static final int a = rand.nextInt(20);

    B() {
        System.out.println(a);
    }
}

public class E18 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

    }
}
