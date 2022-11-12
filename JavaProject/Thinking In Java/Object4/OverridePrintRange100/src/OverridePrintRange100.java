//: OverridePrintRange100/OverridePrintRange100.java
// OverridePrintRange100

public class OverridePrintRange100 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i == 99) {
                break;
            }
        }
    }
}
