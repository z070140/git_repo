package Outer;

public class Outer {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.getInner("Inner", "gz");
        System.out.println(inner.getName());
    }

    class Inner{

        private String nameStr ;
        public String getName() {
           return "我好像被重写了";
        }
    }

    public Inner getInner(final String name, String city) {
        return new Inner() {
            private String nameStr = name;

            public String getName() {
                return nameStr;
            }
        };
    }

}
