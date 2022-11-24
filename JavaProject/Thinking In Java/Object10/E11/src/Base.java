public interface Base {

}

class E11 {
    private class Inner implements Base {
        public void f() {
            System.out.println("Inner");
        }

    }

    public Base getBase() {
        return new Inner();
    }

    public Inner getInner() {
        return new Inner();
    }


}

class Test {
    public static void main(String[] args) {
        E11 e11 = new E11();
        Base base = e11.getBase();
        base = e11.getInner();
//        Inner i = e11.getInner();
//        Inner i2 = (Inner)

    }
}