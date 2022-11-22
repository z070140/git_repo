package nesting;


class Base {
    private interface BaseInterface {
        void f();
    }

    public class BaseD implements BaseInterface {

        @Override
        public void f() {
            System.out.println("Hello");
        }
    }

    public BaseInterface getBaseD() {
        return new BaseD();
    }

}

public class Test {
    public static void main(String[] args) {
        Base b  = new Base();
        Base.BaseD d1 = (Base.BaseD) b.getBaseD();

    }
}
