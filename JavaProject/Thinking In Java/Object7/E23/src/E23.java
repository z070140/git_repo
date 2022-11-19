class LoadTest{
    static {
        System.out.println("Loading LoadTest");
    }
    static void staticMember(){;}
}

public class E23 {
    public static void main(String[] args) {
        System.out.println("Calling static member");
        LoadTest.staticMember();
        System.out.println("Creating an object");
        new LoadTest();
    }
}
