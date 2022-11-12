//: ThisKey/ThisKey.java
//

public class ThisKey {
    public void a() {
        b();
        this.b();
    }

    public void b() {
        System.out.println("b()");
    }

    public static void main(String[] args) {
        new ThisKey().a();
    }
} /* Output
b()
b()
*///:~
