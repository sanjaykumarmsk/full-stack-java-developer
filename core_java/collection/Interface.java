package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Interface {
    public static void main(String args[]) {
        Collection<Integer> nums = new ArrayList<Integer>();

        nums.add(10);
        nums.add(20);
        nums.add(12);
        nums.add(16);
        nums.add(19);

        System.out.println(nums);
    }
}
