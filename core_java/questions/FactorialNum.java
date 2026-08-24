package questions;

public class FactorialNum {
    static int printFact(int n) {
        int ans = 1;
        if (n == 0 || n == 1) {
            return 1;
        }
    
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }
    public static void main(String args[]) {
        int n = 5;
        System.out.println(printFact(n));

    }
}
