//: interfaces/InterfaceCollision.java
//package interfaces;

interface I1 {
    void f();
}

interface I2 {
    int f(int i);
}

interface I3 {
    int f();
}

class C {
    public int f() {
        return 1;
    }
}

class C2 implements I1, I2 {
    public void f() {
    }

    public int f(int i) {
        return 1;
    } // overloaded
}

class C3 extends C implements I2 {
    public int f(int i) {
        return 1;
    } // overloaded
}

class C4 extends C implements I3 {
    // Identical, no problem:
    public int f() {
        return 1;
    }
}

class C7 implements  I2,I3{

    @Override
    public int f(int i) {
        return 0;
    }

    @Override
    public int f() {
        return 0;
    }
}

// Methods differ only by return type:
//class C5 extends C implements I1 {
//  public int f(){
//
//    return 0;
//  }
//}
//interface I4 extends I1, I3 {
//  @Override
//  default void f() {
//
//    return 0;
//  }
//}
// /:~
