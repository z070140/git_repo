class Component1 {
    public Component1(int i) {
        System.out.println("Component1 constructor " + i);
    }

    public void dispose() {
        System.out.println("Component1 dispose");
    }
}

class Component2 {
    public Component2(int i) {
        System.out.println("Component2 constructor " + i);
    }

    public void dispose() {
        System.out.println("Component2 dispose");
    }
}

class Component3 {
    public Component3(int i) {
        System.out.println("Component3 constructor " + i);
    }

    public void dispose() {
        System.out.println("Component3 dispose");
    }

}

class Root {
    Component1 c1 = new Component1(1);
    Component2 c2 = new Component2(2);
    Component3 c3 = new Component3(3);

    Root(int i) {
        System.out.println("Root constructor");
//        c1 = new Component1();
//        c2 = new Component2();
//        c3 = new Component3();
    }

    public void dispose() {
        System.out.println("Root dispose");
        c3.dispose();
        c2.dispose();
        c1.dispose();
    }
}

class Stem extends Root {
    Component1 c1 = new Component1(4);
    Component2 c2 = new Component2(5);
    Component3 c3 = new Component3(6);

    public Stem(int i) {
        super(i);
        System.out.println("Stem");
    }

    public void dispose() {
        System.out.println("Stem dispose");
        c3.dispose();
        c2.dispose();
        c1.dispose();
        super.dispose();
    }
}

public class E09 {
    public static void main(String[] args) {
        new Stem(47).dispose();
    }
}
