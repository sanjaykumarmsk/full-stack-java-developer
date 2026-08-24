package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMap_01 {
    public static void main(String args[]) {
        Map<String, Integer> students = new Hashtable<>();

        students.put("Sanjay", 55);
        students.put("Rahul", 60);
        students.put("Sachin", 30);
        students.put("Aman", 40);

        System.out.println(students);

    }
}
