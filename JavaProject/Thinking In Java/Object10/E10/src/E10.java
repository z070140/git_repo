interface Base {
    Base getBase();
}



public class E10 {
    public static void main(String[] args) {
        if (args.length == 0) {
            class Inner implements Base {
                @Override
                public Base getBase() {
                    System.out.println("Inner");
                    return new Inner();
                }
            }
            new Inner().getBase();
        }

    }
}
