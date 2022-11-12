//: Tank/Tank.java


public class Tank {
    boolean full;
    static int counter;
    int id = counter++;
    

    Tank() {
        full = true;
        System.out.println("Tank " + id + " Created");
    }

    protected void finalize() {
        if (full) {
            System.out.println("Tank " + id + " NOT Empty!");
        } else {
            System.out.println("Tank " + id + " Cleaned up OK!");
        }
    }

    public void empty() {
        full = false;
    }

    public static void main(String[] args) {
        new Tank().empty();
        new Tank();
        Tank tank = new Tank();
        System.gc();
        System.runFinalization();
    }

} /* Output
Tank 0 Created
Tank 1 Created
Tank 0 Cleaned up OK!
Tank 1 NOT Empty!
*///:~
