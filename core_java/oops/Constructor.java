package oops;

class Human {

    //Intance variables
    int age;
    String name;

    //Constructor
    public Human(int ageParam,String nameParam){
        this.age= ageParam;
        this.name= nameParam;
    }
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

public class Constructor {
    public static void main(String args[]) {
        Human obj = new Human(25, "Sanjay"); 
        obj.printDetails();
    }
}
