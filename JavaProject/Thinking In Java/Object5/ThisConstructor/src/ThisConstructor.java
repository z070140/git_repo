//: ThisConstructor/ThisConstructor.java

class ThisClass {
    ThisClass(int i) {
        this((double) i);
        System.out.println("This Int");
    }

    ThisClass(double d) {
        System.out.println("This Double");
    }

    /***
     * 在静态方法内调用非静态方法
     * @param thisClass ThisClass对象的引用
     */
    static void Show(ThisClass thisClass) {
        System.out.println("This is static method.");
        thisClass.ShowNoStatic();
    }

    void ShowNoStatic() {
        System.out.println("This is NOStatic method.");
    }

}

public class ThisConstructor {
    public static void main(String[] args) {
        ThisClass thisClass = new ThisClass(10);
        ThisClass.Show(thisClass);
    }
} /* Output
This Double
This Int
This is static method.
This is NOStatic method.
*///:~
