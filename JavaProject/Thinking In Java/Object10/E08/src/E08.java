class Base{
    private int i=1111;
    class Inner{
        private int i=11;
        private void show(){
            System.out.println("Inner.show()");
        }
    }
    void show(){
        System.out.println(new Inner().i);
        new Inner().show();
    }
}

public class E08 {
    public static void main(String[] args) {
        new Base().show();
//        System.out.println(new Base().i);
    }
}
