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

abstract class  Abstract{
    String s;
    public Abstract(String s){
        this.s=s;
    }
    abstract  void af();
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

class All2 extends Abstract implements I4{

    public All2(){
        super("All2");
    }

    @Override
    public void f1() {
        System.out.println("All2.f1");
    }

    @Override
    public void g1() {
        System.out.println("All2.g1");
    }

    @Override
    public void f2() {
        System.out.println("All2.f2");
    }

    @Override
    public void g2() {
        System.out.println("All2.g2");
    }

    @Override
    public void f3() {
        System.out.println("All2.f3");
    }

    @Override
    public void g3() {
        System.out.println("All2.g3");
    }

    @Override
    public void H() {
        System.out.println("All2.H");
    }

    @Override
    void af() {
        System.out.println("All2.af()");
    }
}

public class E15 {
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
    static void takesAbstract(Abstract a){
        a.af();
    }

    public static void main(String[] args) {
        All2 all =new All2();
        takes1(all);
        takes2(all);
        takes3(all);
        takes4(all);
        takesAbstract(all);
    }


}
