// Sum of Digits of String After Convert: Leetcode easy

public class GetLucky {
    public static void main(String[] args) {
        String str = "leetcode";
        int k = 2;

        int ans = getLucky(str, k);
        System.out.println(ans);
    }

    static int getLucky(String s, int k) {
        int size = s.length();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < size; i++) {
            char ch = s.charAt(i);
            int n = ch - 'a' + 1;
            str.append(n);
        }

        int strLen = str.length();
        int num = 0;

        for (int i = 0; i < strLen; i++) {
            num += str.charAt(i) - '0';
        }

        for (int i = 1; i < k; i++) {
            num = sumOfDigits(num);
        }

        return num;
    }

    static int sumOfDigits(int num) {
        int ans = 0;
        while (num > 0) {
            int d = num % 10;
            ans += d;
            num = num / 10;
        }

        return ans;
    }
}
