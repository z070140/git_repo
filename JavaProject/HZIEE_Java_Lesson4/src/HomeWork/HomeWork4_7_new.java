package HomeWork;

//import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4_7_new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputs[] = {75, 99, 80, 120, 95};
    
        int goal = 100;
        int minDiff = Integer.MAX_VALUE;
        for (int i : inputs) {
            int d = Math.abs(goal - i);
            if(d <= minDiff) {
                minDiff = d;
            }
        }
        int num = 0;
        char peoples[] = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < inputs.length; i++) {
            int n = inputs[i];
            int d = Math.abs(goal - n);
            if(d == minDiff) {
                System.out.print(peoples[i]+" ");
                num++;
            }
        }
        System.out.printf("%.2f",100.0/num);
    }
}