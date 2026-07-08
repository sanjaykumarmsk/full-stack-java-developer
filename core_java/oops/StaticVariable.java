package oops;

class Mobile {
    //Instance variables
    String brand;
    int price;
    //Static variable
    static String model;

    public void show() {
        System.out.println("Brand: " + brand + ", Price: " + price + ", Model: " + model);
    }
}


public class StaticVariable {
    public static void main(String args[]) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 20000;
        //Setting static variable using class name
        Mobile.model = "Galaxy S21";
        obj1.show();

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 80000;
        //Setting static variable using class name
        Mobile.model = "iPhone 13";
        obj2.show();
    }
}
