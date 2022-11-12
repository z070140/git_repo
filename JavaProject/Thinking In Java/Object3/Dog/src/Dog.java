//: Dog/Dog.java
// equals

class Dogs{
    String name;
    String says;
}

public class Dog {
    public static  void main(String[] args) {
        Dogs spot = new Dogs();
        spot.name = "spot";
        spot.says = "Ruff! ";
        Dogs scruffy = new Dogs();
        scruffy.name = "scruffy";
        scruffy.says = "Wurf! ";
        System.out.println(spot.name + ":" + spot.says);

        System.out.println(scruffy.name + ":" + scruffy.says);
        Dogs newDog = new Dogs();
        newDog = spot;
        System.out.println(newDog.equals(spot));
    }
} /* Output:
spot:Ruff!
scruffy:Wurf!
true
*///~
