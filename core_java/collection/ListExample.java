package collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(10);
        nums.add(15);
        nums.add(11);
        nums.add(8);
        nums.add(5);

        System.out.println(nums.indexOf(8)); // 10
        System.out.println(nums.get(4)); // 5
    }
}