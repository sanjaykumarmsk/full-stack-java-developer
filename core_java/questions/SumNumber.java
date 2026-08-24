package questions;

public class SumNumber {
    static int sumOfNumber(int num) {
        int ans = 0;
        while (num != 0) {
            int rem = num % 10;
            ans += rem;
            num /= 10;

        }
        return ans;
    }
    public static void main(String args[]) {
        int num = 123456;
        System.out.println(sumOfNumber(num));
    }
}
