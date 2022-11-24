package first;

public class First {
    private String s;

    private void print() {
        System.out.println("First");
    }

    public class Inner {
        public void setGet(String s1) {
            s = s1;
            System.out.println(s);
            print();
        }
    }

    void useInner(String s2) {
        new Inner().setGet(s2);
    }

    public static void main(String[] args) {
        new First().useInner("Hello");
    }
}


