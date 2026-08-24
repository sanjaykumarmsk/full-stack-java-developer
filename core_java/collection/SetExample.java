package collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String args[]) {
        Set<Integer> nums = new HashSet<Integer>();

        nums.add(10);
        nums.add(15);
        nums.add(8);
        nums.add(11);
        nums.add(9);
        nums.add(13);

        for (int n : nums) {
            System.out.print(n+" ");
        }
    }
}
