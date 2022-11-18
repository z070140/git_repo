class Swim {
    String s;

    Swim() {
        System.out.println("Inside Swim");
        s = "swimming";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class E04 {
    private Swim swimming;

    @Override
    public String toString() {
        if (swimming == null) {
            swimming = new Swim();
        }
        return "E04{" +
                "swimming=" + swimming +
                '}';
    }

    public static void main(String[] args) {
        E04 e04 = new E04();
        System.out.println(e04);
    }
}
