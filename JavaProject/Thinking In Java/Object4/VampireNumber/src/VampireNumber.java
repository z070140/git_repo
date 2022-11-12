//: VampireNumber/VampireNumber.java
// Find VampireNumber 吸血鬼数
// 把四位数字拆分开来。
public class VampireNumber {
    public static void main(String[] args) {
        int[] start = new int[4];
        int[] ride = new int[4];
        for (int num1 = 10; num1 <= 99; num1++) {
            for (int num2 = num1; num2 <= 99; num2++) {
                if ((num1 * num2) % 9 != (num1 + num2) % 9) {
                    continue;
                }
                int rideNum = num1 * num2;
                start[0] = num1 % 10;
                start[1] = num1 / 10;
                start[2] = num2 % 10;
                start[3] = num2 / 10;
                ride[0] = rideNum / 1000;
                ride[1] = (rideNum % 1000) / 100;
                ride[2] = rideNum % 1000 % 100 / 10;
                ride[3] = rideNum % 1000 % 100 % 10;
                int count = 0;
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (start[i] == ride[j]) {
                            count++;
                            start[i] = -2;
                            ride[j] = -1;
                            if (count == 4) {
                                System.out.println(num1 + "*" + num2 + '=' + rideNum);
                            }
                        }
                    }
                }
            }
        }
    }
} /* Output
15*93=1395
21*60=1260
21*87=1827
27*81=2187
30*51=1530
35*41=1435
80*86=6880
*///:~

