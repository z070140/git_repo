//: LongWithOCTAndHEX/LongWithOCTAndHEX.java
// control long with OCT And Hex.
public class LongWithOCTAndHEX {
    public static void main(String[] args) {
        long n1 = 0777;
        long n2 = 0x2A;
        System.out.println(Long.toBinaryString(n1));
        System.out.println(Long.toBinaryString(n2));
    }
} /* Output:
111111111
101010
*///~
