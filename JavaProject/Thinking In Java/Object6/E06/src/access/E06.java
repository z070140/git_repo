package access;

class WithProtected {
    protected int i;

    protected void setI(int i) {
        this.i = i;
    }
}

public class E06 {
    public static void main(String[] args) {
        WithProtected wp = new WithProtected();
        wp.setI(47);
        System.out.println("wp.i = " + wp.i);
    }
}
