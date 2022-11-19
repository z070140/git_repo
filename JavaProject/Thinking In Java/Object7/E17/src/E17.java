//package reusing;

class Amphibian {
    public void moveInWater() {
        System.out.println("Moving in Water");
    }
    public void moveOnLand() {
        System.out.println("Moving on Land");
    }
}


class Frog extends Amphibian {
    private int a = 10;

    public int getA() {
        return a;
    }

    public void moveInWater() {
        System.out.println("Frog swimming");
    }
    public void moveOnLand() {
        System.out.println("Frog jumping");
    }

}

public class E17 {
    public static void main(String[] args) {
        Amphibian a = new Frog();
        System.out.println(a.getClass());
        a.moveInWater();
        a.moveOnLand();
//        a.getA();
    }
}
