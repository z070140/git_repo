
abstract  class Base{
    public  Base(){ print(); }
   public abstract void print();
}
class Derived extends  Base{
    private int n =1;
    public void print(){
        System.out.println(n);
    }
}


public class E03 {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.print();
    }
}
