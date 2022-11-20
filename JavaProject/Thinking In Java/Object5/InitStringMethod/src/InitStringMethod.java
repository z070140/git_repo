//: InitStringMethod.java

public class InitStringMethod {
    public static void main(String[] args) {
        String[] a = new String[4];
        a[0] = "I";
        a[1] = " am";
        a[2] = " String";
        a[3] = " .";
        for (String s : a) {
            System.out.print(s);
        }
        String[] b= {"I","am","b","."};
        for(String s: b){
            System.out.println(s);
        }
    }
} /* Output
I am String .I
am
b
.
*///:~
