package reusing;

class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute() ");
    }

    public void apply() {
        append(" apply() ");
    }

    public void scrub() {
        append(" scrub() ");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}


public class Detergent extends Cleanser {
    private Cleanser cleanser = new Cleanser();
//    private String s;

//    public Detergent() {
//        super();
//    }

    public void append(String a) {
        cleanser.append(a);
    }

    public void dilute() {
        cleanser.append(" dilute() ");
    }

    public void apply() {
        cleanser.append(" apply() ");
    }

    public void scrub() {
        append(" DetergentDelegation.scrub() ");
        cleanser.append(" scrub() ");
    }

    public void foam() {
        append(" foam() ");
    }

    @Override
    public String toString() {
        return cleanser.toString();
    }

    public static void main(String[] args) {
        Detergent d = new Detergent();
        d.append(" append() ");
        d.dilute();
        d.apply();
        d.scrub();
        d.foam();
        System.out.println(d);
        System.out.println("Testing base class: ");
        Cleanser.main(args);
    }

}


