// in this java program we will find the nth fibonacci number using recursion

public class Fibonacci {
    public static void main(String[] args) {
        int targetIndex = 7;
        int ans = fibo(targetIndex);
        System.out.println(ans);
    }

    static int fibo(int n) {
        if (n < 2) { // base condition
            return n;
        }

        return fibo(n - 1) + fibo(n - 2); // recursive call
    }
}
