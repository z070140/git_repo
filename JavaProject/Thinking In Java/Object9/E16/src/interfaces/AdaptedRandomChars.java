package interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdaptedRandomChars extends CharSequence implements Readable {
    private int count;

    public AdaptedRandomChars(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
         ;
        char[] buffer = generate();

        cb.put(buffer);
//        cb.append(buffer)
        return buffer.length;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomChars(10));
        while (s.hasNext()) {
            System.out.println(s.next());
            System.out.println();
            System.
        }
    }
}
