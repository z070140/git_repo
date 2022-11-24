public class Outer {
    class Inner {
        {
            System.out.println("Inner created");
        }

        public Inner() {

        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Inner i = new Outer().getInner();
    }
}
