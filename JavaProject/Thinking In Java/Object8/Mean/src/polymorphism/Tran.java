package polymorphism;

class transportation {
    public transportation t1;
    private String s;
    public static final int STATIC_NUMBER = 10;

    public String returnString() {
        return s;
    }
}

class Car extends transportation {

    Car() {
        System.out.println("111");
    }

    public String returnString() {
        super.returnString();
    }
}

public class Tran {
    public static void main(String[] args) {
        System.out.println(new Car().STATIC_NUMBER);
    }

}
