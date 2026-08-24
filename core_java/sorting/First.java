package sorting;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class First {
    public static void main(String args[]) {
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(10);
        nums.add(5);
        nums.add(15);
        nums.add(12);
        nums.add(6);

        Collections.sort(nums);
        System.out.println(nums);
    }
}
