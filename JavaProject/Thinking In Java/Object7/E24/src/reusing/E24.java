package reusing;

class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 =
            printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 =
            printInit("static Beetle.x2 initialized");

}

class JapaneseBeetle extends Beetle {
    int m = printInit("JapaneseBeetle.m initialized");

    JapaneseBeetle() {
        System.out.println("m = " + m);
        System.out.println("j = " + j);
    }

    static int x3 = printInit("static JapaneseBeetle.x3 initialized");

}

public class E24 {
    public static void main(String[] args) {

        new JapaneseBeetle();
    }
}