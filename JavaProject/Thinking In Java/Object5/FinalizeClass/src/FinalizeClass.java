//: FinalizeClass/FinalizeClass.java

//class Test {
//    int a = 0;
//
//    Test(int i) {
//        a = i;
//    }
//
//    void check() {
//        a = 0;
//    }
//
//    protected void finalize() throws Throwable {
//        if (a != 0) {
//            System.out.println("a!=0");
////            super.finalize();
//        }
//    }
//}

public class FinalizeClass {
    protected void finalize(){
        System.out.println("finalize() called");
    }
    public static void main(String[] args) {
//        Test test1 = new Test(1);
//        test1.check();
//        new Test(2);
//        System.gc();
    new FinalizeClass();
        System.gc();
        System.runFinalization();
    }
}
