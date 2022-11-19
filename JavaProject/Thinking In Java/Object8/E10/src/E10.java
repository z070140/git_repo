class TwoMethods {
    public void firstMethod() {
        System.out.println("THis is Base First");
        secondMethod();
    }

    public void secondMethod() {
        System.out.println("THis is Base Second");
    }
}

class E extends TwoMethods {

    public void secondMethod() {
        System.out.println("THis is E First");
    }
}

public class E10 {
    public static void main(String[] args) {
        E e = new E();
        e.firstMethod();
    }
}
