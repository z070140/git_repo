package innerclasses;

class Outer {
    private String s;

    Outer(String s) {
        this.s = s;
    }

    class Inner {
        {
            System.out.println("Inner created");
        }



        @Override
        public String toString() {
            return s;
        }
    }
    Inner getInner() {
        return new Inner();
    }
}

public class E03 {
    public static void main(String[] args) {

        System.out.println(new Outer("Hello").getInner().toString());
        Outer o =  new Outer("Test");
        Outer.Inner i = o.getInner();
        System.out.println(i);
    }
}
