final class FinalBase {
    int a = 10;
    String s = "Hello";

}

public class E22_FinalClass extends FinalBase {
    public static void main(String[] args) {
        FinalBase f = new FinalBase();
        System.out.println(f.a);
        System.out.println(f.s);
    }
}