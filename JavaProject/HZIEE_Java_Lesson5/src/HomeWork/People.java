package HomeWork;

import java.util.Scanner;

public class People {
    String name;
    int height, weight;

    People(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    int check() {
        if (height - 110 - weight < -5) {
            return 1;
        } else if (height - 110 - weight > 5 ) {
            return -1;
        } else  {
            return 0;
        }

    }


    public static void main(String[] args) {
        int thin = 0;
        int standard = 0;
        int fat = 0;

        People[] arr = new People[5];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            String name = input.next();
            int height = input.nextInt();
            int weight = input.nextInt();
            arr[i] = new People(name, height, weight);

        }
        input.close();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i].check();
            if (num == -1) {
                thin++;
            } else if (num == 1) {
                fat++;
            } else {
                standard++;
            }

        }
        System.out.println("thin: " + thin + " standard: " + standard + " fat: " + fat);
    }


}