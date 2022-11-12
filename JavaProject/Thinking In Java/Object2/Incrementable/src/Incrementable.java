
class StaticTest{
    static int i =47;
}



class Incrementable {

    static void increment() {
        StaticTest.i++;
    }

}
class Main{

    public static void main(String[] args){
        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println(StaticTest.i);
    }
}
