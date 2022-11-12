//: BitOperation/BitOperation.java
// BitOperation Using HEX.

public class BitOperation {
    public static void main(String[] args){
        int a = 0xAA;
        int b = 0x155;
        System.out.println("a: "+Integer.toBinaryString(a));
        System.out.println("b: "+Integer.toBinaryString(b));
        System.out.println("~a: "+Integer.toBinaryString(~a));
        System.out.println("~b: "+Integer.toBinaryString(~b));
        System.out.println("a&b: "+Integer.toBinaryString(a&b));
        System.out.println("a|b: "+Integer.toBinaryString(a|b));
        System.out.println("a^b: "+Integer.toBinaryString(a^b));

    }
} /* Output
a: 10101010
b: 101010101
~a: 11111111111111111111111101010101
~b: 11111111111111111111111010101010
a&b: 0
a|b: 111111111
a^b: 111111111
*///:~
