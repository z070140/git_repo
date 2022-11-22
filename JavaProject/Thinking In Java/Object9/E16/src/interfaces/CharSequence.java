package interfaces;

import java.util.Random;

public class CharSequence {
    private static Random rand = new Random(47);
    private static final char[] capitals =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers =
            "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels =
            "aeiou".toCharArray();

    public char[] generate() {
        char[] buffer = new char[10];
        int idx = 0;
        buffer[idx++] = capitals[rand.nextInt(capitals.length)];
        for (int i = 0; i < 4; i++) {
            buffer[idx++] = vowels[rand.nextInt(vowels.length)];
            buffer[idx++] = lowers[rand.nextInt(lowers.length)];
        }
        buffer[idx] = ' ';

        return buffer;
    }
}
