
class Varargs{

}

public class StringVarargs {
    static  void f(String... args){
        for(String s: args){
            System.out.println(s);
        }
    }
    public static void main(String[] args){
        f("Hello","World","!");
        f(new String[3]);
        f(new String[]{"你好","世界","!"});
    }
} /* Output
Hello
World
!
null
null
null
你好
世界
!
*///:~
