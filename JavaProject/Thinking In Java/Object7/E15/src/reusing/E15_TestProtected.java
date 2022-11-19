package reusing;


import reusng.protect.E15_Protected;

class Derived extends E15_Protected{
    public void g(){
        f();
    }
}

public class E15_TestProtected {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.g();
    }
}
