package access.E05;

public class E05_Class {
    public int a = 1;
    private int b = 2;
    protected int c = 3;
    int d = 4;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    private int getB() {
        return b;
    }

    private void setB(int b) {
        this.b = b;
    }

    protected int getC() {
        return c;
    }

    protected void setC(int c) {
        this.c = c;
    }

    int getD() {
        return d;
    }

    void setD(int d) {
        this.d = d;
    }

    public static void main(String[] args) {
        E05_Class e05_class = new E05_Class();
        e05_class.a = 10;
        e05_class.b = 20;
        e05_class.c = 30;
        e05_class.d = 40;
        System.out.println(e05_class.getA());
        System.out.println(e05_class.getB());
        System.out.println(e05_class.getC());
        System.out.println(e05_class.getD());

    }
}


