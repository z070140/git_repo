package Lesson4;

public class Fibonacci {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i=0;i<5;i++) {
            int v = f(i);
            System.out.print(v+" ");
        }
    }
    
    public static int f(int n) {
        if (n==0) {
            return 1;
        }
        if (n==1) {
            return 2;
            
        }
        return f(n-2) + f(n-1);
    }

}
