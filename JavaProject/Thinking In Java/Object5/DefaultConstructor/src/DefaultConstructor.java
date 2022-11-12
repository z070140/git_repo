//: DefaultConstructor/DefaultConstructor.java
// Test Default Constructor.

class Default{
    Default(){
        System.out.println("Default Constructor");
    }
    Default(String s){
        System.out.println("Constructor");
        System.out.println(s);
    }
}

public class DefaultConstructor {
    public static void main(String[] args){
        Default defaultConstructor = new Default();
        Default newConstructor = new Default("Overloaded");
    }
} /* Output
Default Constructor
Constructor
Overloaded
*///:~
