//: HEXBitwise/HEXBitwise.java
// Bitwise print BIN use if-else.
// int四个字节，所以定义char数组32,十进制转2进制，除2取余，逆序余数，所以第一次的余数放在数组最后.

public class HEXBitwise {

    public static void toBIN(int num) {
        char[] a = new char[32];
        int count = 32;
        do {
            a[--count] = ((num & 0x01) == 0 ? '0' : '1');
            num >>>= 1;
        } while (num != 0);
        for (int j = count; j < 32; j++) {
            System.out.print(a[j]);
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int oa = 0xaa;
        int ob = 0x55;
        int count = 0;
        int andAB = oa & ob;
        int orAB = oa | ob;
        int xorAB = oa ^ ob;
        toBIN(oa);
        System.out.println(Integer.toBinaryString(oa));
        toBIN(ob);
        toBIN(10);
        System.out.println(Integer.toBinaryString(10));

    }
} /* Output
10101010
10101010
1010101
1010
1010
*///:~