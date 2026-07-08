package oops;

class Solution {
    public void printSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public void printSum(double a, double b) {
        System.out.println("Sum: " + (a + b));
    }

    public void printSum(float a, float b) {
        System.out.println("Sum: " + (a + b));
    }
}

public class Method {
    public static void main(String args[]) {
        Solution obj = new Solution();
        obj.printSum(10, 20);
        obj.printSum(5.50, 10.05);
        obj.printSum(2.5, 5.5);
        
    }
}
