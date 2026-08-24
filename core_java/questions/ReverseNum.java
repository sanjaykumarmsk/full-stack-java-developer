package questions;

public class ReverseNum {
    static int reverseNum(int num) {
        int ans = 0;
        while (num != 0) {
            int rem = num % 10;
            ans = ans * 10 + rem;
            num /= 10;
        }
        return ans;
    }
    public static void main(String args[]) {
        int num = 12345;
        System.out.println("Reverse num : " + reverseNum(num));
    }
}
