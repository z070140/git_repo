import java.util.Scanner;

//: Fibonacci/Fibonacci.java
// Print begin - Scanner num   Fibonacci  nums
public class Fibonacci {
    public static  void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int first =1;
        System.out.println(first);
        int second=1;
        System.out.println(second);
        while(num-2!=0){
            int temp = second;
            second=first+second;
            System.out.println(second);
            first=temp;
            num--;
        }


    }
}
