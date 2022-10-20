package HomeWork;

import java.util.Scanner;

public class T5_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        input.close();

        Equation e = new Equation(a, b, c);
        System.out.println(e);

        e.Solving();
        switch (e.rootType) {

            case 0:
                System.out.println("Equation has no real solution.");
                break;
            case 1:
                System.out.printf("Equation has one real solution: %.2f\n", e.root1);
                break;
            case 2:
                System.out.printf("Equation has two real solutions: %.2f, %.2f\n", e.root1, e.root2);
                break;

        }
    }
}

class Equation {
    int rootType;
    float a, b, c;
    float root1, root2;

    public Equation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public  String toString() {
        return this.a + " * x * x + " + this.b + " * x + " + this.c;
    }

    public void Solving() {
        if (a == 0) {
            root1 = -c / b;
            rootType = 1;
        } else {
            if (Math.sqrt(b * b - 4 * a * c) > 0) {
                rootType = 2;
                root1 = (-b+(float)Math.sqrt(b*b-4*a*c))/(2*a);
                root2 = (-b-(float)Math.sqrt(b*b-4*a*c))/(2*a);
            } else if (Math.sqrt(b * b - 4 * a * c) == 0) {
                root1 = (-b+(float)Math.sqrt(b*b-4*a*c))/(2*a);
                rootType = 1;
            }else{
                rootType = 0;
            }
        }


    }

}