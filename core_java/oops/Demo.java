package oops;
import java.util.*;

class Laptop {
    String model;
    int price;
}
public class Demo {

    public static void main(String args[]) {
        Laptop obj = new Laptop();
        obj.model = "Lenove Yoga";
        obj.price = 10000;

        System.out.println(obj);
    }
}