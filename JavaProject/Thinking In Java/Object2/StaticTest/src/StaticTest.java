
class Incrementable{
    static void increment(){
	StaticClass.i++;
    }
}

class StaticClass{
    static int i =47;
}

public class StaticTest {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	StaticClass st1 = new StaticClass();
	StaticClass st2 = new StaticClass();
	System.out.print(st1.i==st2.i);
	Incrementable sf = new Incrementable();
	sf.increment();
	Incrementable.increment();
	System.out.print(":"+StaticClass.i);
	
	
    }

}
