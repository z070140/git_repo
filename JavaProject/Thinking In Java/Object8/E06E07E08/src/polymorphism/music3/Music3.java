//: polymorphism/music3/Music3.java
// An extensible program.
package polymorphism.music3;
//import static net.mindview.util.System.out.println.*;

import polymorphism.music.Note;

import java.lang.reflect.Constructor;
import java.util.Random;

class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    public String toString() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    public String toString() {
        return "Wind";
    }


    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    public String toString() {
        return "Percussion";
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    public String toString() {
        return "Stringed";
    }


    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind {
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    public String toString() {
        return "Woodwind";
    }
}

class Electronic extends Instrument {
    void play(Note n) {
        System.out.println("Electronic.play() " + n);
    }

    public String toString() {
        return "Electronic";
    }
}

class InstrumentGenerator {
    Random gen = new Random(47);

    public Instrument next() {
        switch (gen.nextInt(6)) {
            default:
            case 0:
                return new Wind();
            case 1:
                return new Percussion();
            case 2:
                return new Stringed();
            case 3:
                return new Brass();
            case 4:
                return new Woodwind();
            case 5:
                return new Electronic();
        }
    }
}

class InstrumentGenerator2 {
    Random gen = new Random(47);
    Class<?> instruments[] = {
            Wind.class,
            Percussion.class,
            Stringed.class,
            Brass.class,
            Woodwind.class,
            Electronic.class,
    };


    public Instrument next() {
        try {
            int idx = Math.abs(gen.nextInt(instruments.length));
            return (Instrument) instruments[idx].getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Cannot Create", e);
        }
    }
}

public class Music3 {
    // Doesn't care about type, so new types
    // added to the system still work right:

    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

//    public  Music3(){
//        System.out.println("constructor");
//    }

    public static void main(String[] args) {
        // Upcasting during addition to the array:
        InstrumentGenerator2 gen = new InstrumentGenerator2();
        for (int i = 0; i < 20; i++) {
            System.out.println(gen.next());
        }
//        try {
//            Constructor constructor = Music3.class.getConstructor();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }

    }
} /* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~
