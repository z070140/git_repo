package notebook;

import java.io.PrintWriter;
import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.HashSet;

class Value {
    private int i;

    public void set(int i) {
        this.i = i;
    }
/**
 * 
 * @return
 */
    public int get() {
        return i;
    }

    public String toString() {
        return "" + i;
    }
}

public class NoteBook {
    private ArrayList<String> notes = new ArrayList<>();

    public void add(String s) {
        notes.add(s);

    }

    public void add(String s, int location) {
        notes.add(location, s);
    }

    public int getSize() {
        return notes.size();

    }

    public String getNote(int index) {
        return notes.get(index);
    }

    public void removeNote(int index) {
        notes.remove(index);
    }

    public String[] list() {
        int[] ia = new int[10];
        String[] a = new String[notes.size()];
//	for (int i = 0; i < notes.size(); i++) {
//	    a[i] = notes.get(i);
//	}
        notes.toArray(a);
        return a;
    }

    public static void main(String[] args) {
	String aString = ""+123;
	System.out.println(aString);
//        int a = 0;
//        int b = 0;
//        System.out.println(args[0]);
        Value v = new Value();
        v.set(10);
        System.out.println(v);
        ArrayList<String> a = new ArrayList<String>();
        a.add("first");
        a.add("second");
        a.add("first");
        System.out.println(a);
        System.out.println("---------------");
        HashSet<String> s = new HashSet<String>();
        s.add("first");
        s.add("second");
        s.add("first");
        System.out.println(s);
    }

}
