interface Base {
    Base getBase();
}

public class E09 {
    public static void main(String[] args) {
        class Inner implements  Base{
            @Override
            public Base getBase() {
                System.out.println("Inner");
                return new Inner();
            }
        }
        new Inner().getBase();
    }
}
