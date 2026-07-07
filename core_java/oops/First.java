package oops;

class calc{
    int a;

    public int add(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
}
public class First {
    public static void main(String args[]) {
        int num1 = 4;
        int num2 = 5;

        calc obj = new calc();
        int ans = obj.add(num1, num2);
        System.out.println(ans);
    }
}
