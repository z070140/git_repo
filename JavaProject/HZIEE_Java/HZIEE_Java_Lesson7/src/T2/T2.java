package T2;
public class T2{
    public static void main(String[] args) {

        String greeting[] = {"Happy", "new", "year"};

        for (int i = 0; i < 3; i++) {

            try {

                System.out.print(greeting[i]);

            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.print("!");

            } finally {

                System.out.print("~");

            }

        }

    }
}