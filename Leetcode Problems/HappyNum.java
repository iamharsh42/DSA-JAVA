// Leetcode Easy : Happy Numbers --> Bruteforce solution

import java.util.HashSet;

public class HappyNum {
    public static void main(String[] args) {
        System.out.println(isHappy(44));
        System.out.println(isHappy(9));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        boolean isHappy = false;

        while (n > 0) {
            int val = compute(n);
            if (val == 1) {
                isHappy = true;
                break;
            } else if (set.contains(val)) {
                break;
            } else {
                set.add(val);
                n = val;
            }
        }

        return isHappy;
    }

    public static int compute(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            sum += Math.pow(d, 2);
        }

        return sum;
    }
}