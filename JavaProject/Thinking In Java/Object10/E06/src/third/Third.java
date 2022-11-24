package third;

import first.First;
import second.Second;

public class Third extends Second {
    public First getSecondInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        new Third().getSecondInner().show();
    }
}
