package my_first_java_project;

public class Scan {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        y = ++x;
        System.out.println(x + y);
        boolean yes;
        //yes = (y % 2 != 1);
        yes = ( y % 2 == 0);
        System.out.println(yes);
    }
}
