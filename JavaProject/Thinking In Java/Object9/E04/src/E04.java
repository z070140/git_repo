abstract class NoMethods {
}

class Extended1 extends NoMethods {
    public void f() {
        System.out.println("Extended1.f");
    }
}

abstract class WithMethods {
    abstract public void f();
}

class Extended2 extends WithMethods {
    public void f() {
        System.out.println("Extended2.f");
    }
}


public class E04 {
    public static void test1(NoMethods nm) {
        ((Extended1) nm).f();
    }

    public static void test2(WithMethods wm) {
        wm.f();
    }

    public static void main(String[] args) {
        NoMethods nm = new Extended1();
        test1(nm);
        WithMethods wm = new Extended2();
        test2(wm);
    }
}
