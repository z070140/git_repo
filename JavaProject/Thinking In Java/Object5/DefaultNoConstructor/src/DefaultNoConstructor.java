//: DefaultNoConstructor/DefaultNoConstructor.java
class NoConstructor{
    int a;
    public void Show(){
        System.out.println(a);
    }
}

public class DefaultNoConstructor {
    public static void main(String[] args){
        NoConstructor noConstructor = new NoConstructor();
        noConstructor.Show();
        new DefaultNoConstructor();
    }
} /* Output
0
*///:~
