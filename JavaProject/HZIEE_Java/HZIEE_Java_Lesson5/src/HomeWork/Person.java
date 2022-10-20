package HomeWork;

import java.util.jar.Attributes.Name;

class Person {
    private String name = "";
    private int age;

    private Person() {

	name = "Anonymous";
	age = 20;
    }

    private String getName() {
	return name;
    }

    private int getAge() {
	return age;
    }

    private String setName(String name) {
	this.name = name;
	return this.name;
    }

    private int setAge(int age) {
	this.age = age;
	return this.age;
    }

    public static void main(String[] args) {
	Person person = new Person();
	System.out.println("Name: " + person.getName());
	System.out.println("Age: " + person.getAge());

	person.setName("Lisa");
	person.setAge(18);
	System.out.println("Name: " + person.getName());
	System.out.println("Aage: " + person.getAge());

    }
}