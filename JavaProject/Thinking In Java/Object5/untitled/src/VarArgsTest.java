
public class VarArgsTest {
    public static void m1(String s, String... ss) {
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }
    }

    public static void main(String[] args) {

        m1("");
        m1("aaa");
        m1("aaa", "bbb");
    }
}