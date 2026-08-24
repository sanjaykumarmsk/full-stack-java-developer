package questions;

public class UsingTernaryFact {
    static int fact(int n) {
        return (n == 0 || n == 1) ? 1 : n * fact(n - 1);
    }

    public static void main(String args[]) {
        int n = 4;
        System.out.println(fact(n));
    }
}
