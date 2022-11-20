//: StringClass.java

//class StringInit{
//
//}

public class StringClass {
    String s;

    StringClass(String s) {
        System.out.println(s);
        this.s = s;
    }

    public static void main(String[] args) {
        StringClass[] stringClass = new StringClass[5];
        for (int i = 0; i < stringClass.length; i++) {
            stringClass[i] = new StringClass(Integer.toString(i));
        }
        for (StringClass s : stringClass) {
            System.out.println(s.s);
        }
    }
}
