package Lesson4;

public class NumberCombination {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // int a = 1;
        // int b = 2;
        // int c = 3;
        // int d = 4;
        int count = 0;
        for (int x = 4; x > 0; x--) {
            for (int y = 1; y <= 4; y++) {
                if (y == x) {
                    continue;
                }
                for (int z = 4; z >= 1; z--) {

                    if (y != z && x != z) {

                        count++;
                        System.out.println(x * 100 + y * 10 + z);

                    }
                }
            }
        }
        System.out.println(count);
    }

}
