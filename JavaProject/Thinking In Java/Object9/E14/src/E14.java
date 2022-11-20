interface I1 {
    void f1();

    void g1();
}

interface I2 {
    void f2();

    void g2();
}

interface I3 {
    void f3();

    void g3();
}

interface I4 extends I1,I2,I3{
    void H();
}

class Concrete{
    String s;
    public Concrete(String s){
        this.s=s;
    }
}

class All extends Concrete implements I4{
    public All(){
        super("All");
    }

    @Override
    public void f1() {
        System.out.println("All.f1");
    }

    @Override
    public void g1() {
        System.out.println("All.g1");
    }

    @Override
    public void f2() {
        System.out.println("All.f2");
    }

    @Override
    public void g2() {
        System.out.println("All.g2");
    }

    @Override
    public void f3() {
        System.out.println("All.f3");
    }

    @Override
    public void g3() {
        System.out.println("All.g3");
    }

    @Override
    public void H() {
        System.out.println("All.H");
    }
}

public class E14 {
    static void takes1(I1 i){
        i.f1();
        i.g1();
    }
    static void takes2(I2 i){
        i.f2();
        i.g2();
    }
    static void takes3(I3 i){
        i.f3();
        i.g3();
    }
    static void takes4(I4 i){
        i.H();
    }

    public static void main(String[] args) {
        All all =new All();
        takes1(all);
        takes2(all);
        takes3(all);
        takes4(all);
    }


}
