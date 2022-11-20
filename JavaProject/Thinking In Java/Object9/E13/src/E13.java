interface I1{
    void f();
}
interface  I1_1 extends I1{
    @Override
    void f();
}

interface I1_2 extends I1{
    @Override
    void f();
}

interface I2 extends I1_1,I1_2{
    @Override
    void f();
}

class I3 implements I2{
    public void f(){
        System.out.println("I3.f()");
    }
}

public class E13 {
    public static void main(String[] args) {
        new I3();
    }
}
