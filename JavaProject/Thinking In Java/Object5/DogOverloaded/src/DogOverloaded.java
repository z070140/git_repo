//: DogOverloaded/DogOverloaded.java


class Dog {
    public void bark() {
        System.out.println("Default bark!");
    }

    public void bark(int i) {
        System.out.println("int bark!");
    }

    public void bark(double d) {
        System.out.println("double bark!");
    }

    public void bark(int i, double d) {
        System.out.println("int bark!,double bark!");
    }

    public void bark(double d, int i) {
        System.out.println("double bark!,int bark!");
    }
}

public class DogOverloaded {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark(1);
        dog.bark(1.1);
        dog.bark(1, 1.1);
        dog.bark(1.1, 1);
    }
} /* Output
Default bark!
int bark!
double bark!
int bark!,double bark!
double bark!,int bark!
*///:~
