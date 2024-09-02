// Number Complement: Leetcode easy

public class NumberComplement {
    public static void main(String[] args) {
        int n = 5;
        int ans = findComplement(n);
        System.out.println(ans);
    }

    static int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);
        StringBuilder complement = new StringBuilder();
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '0') {
                complement.append('1');
            } else {
                complement.append('0');
            }
        }

        return Integer.parseInt(complement.toString(), 2);
    }
}
