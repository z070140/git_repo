import base.Base;

public class Derived implements Base {
    @Override
    public void print() {
        System.out.println("print()");
    }

    @Override
    public void set() {
        System.out.println("set()");

    }

    @Override
    public void get() {
        System.out.println("get()");
    }



    public static void main(String[] args) {
        Derived d = new Derived();
        d.print();
        ;
        d.get();
        d.set();

    }
}
