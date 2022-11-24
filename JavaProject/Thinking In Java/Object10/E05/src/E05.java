class Base {
    Base() {
        System.out.println("Base.constructor");
    }

    class ddd {
        ddd() {
            System.out.println("ddd.constructor");
        }
    }
}

public class E05 {
    public static void main(String[] args) {
        Base.ddd d =  new Base(). new ddd();
    }
}
