class BlankFinal {
    private final Integer i;

    public BlankFinal(int ii) {
        i = new Integer(ii);
    }

    public Integer getI() {
//        if (i == null) {
//            i = new Integer(47);
//        }
        return i;
    }

}

public class E19 {
    public static void main(String[] args) {
        BlankFinal b = new BlankFinal(47);
        System.out.println(b.getI());

    }
}
