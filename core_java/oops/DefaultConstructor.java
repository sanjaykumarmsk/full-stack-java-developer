package oops;

class Person {
    private int age;
    private String name;

    public Person() {
        this.age = 25;
        this.name = "Sanjay";
    }

    public void printPerson() {
        System.out.println("Name: " + name + " Age : " + age); 

    }
}

public class DefaultConstructor {
    public static void main(String args[]) {
        Person obj = new Person();
        obj.printPerson();

        
    }
}
