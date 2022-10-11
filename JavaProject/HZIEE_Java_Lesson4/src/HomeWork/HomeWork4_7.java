package HomeWork;

//import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] money = new double[5];
        double count[] = new double[5];
        String[] name = { "a", "b", "c", "d", "e" };

        for (int i = 0; i < money.length; i++) {
            money[i] = in.nextDouble();
            count[i] = Math.abs(100 - money[i]);
        }

        double min = 1000000000;

        double num = 0;

        for (int i = 0; i < count.length; i++) {
            if (min >= count[i]) {
                min = count[i];

            }
        }
        for (int i = 0; i < count.length; i++) {
            if (min == count[i]) {
                num++;
                System.out.print(name[i] + " ");
            }

        }
        System.out.printf("%.2f", 100.0 / num);
    }
}