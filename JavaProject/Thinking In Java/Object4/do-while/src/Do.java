public class Do {

    public static void doWhile() {
        int count = 0;
        int cnt=3;
        do {
            System.out.println("Inside do");
            count += 1;
            System.out.println(count);
            cnt--;
        } while (cnt>0);
        System.out.println("Outside do");
    }

    public static void While() {
        int count = 0;
        int cnt=3;
        while (cnt>0) {
            System.out.println("Inside while");
            count += 1;
            System.out.println(count);
            cnt--;
        }
        System.out.println("Outside while");
    }

    public static void main(String[] args) {
        doWhile();
        While ();
    }
}
