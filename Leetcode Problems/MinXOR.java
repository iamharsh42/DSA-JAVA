// Leetcode daily challenge: Minimize XOR --> Optimal solution

public class MinXOR {
    public static void main(String[] args) {
        System.out.println(minimizeXor(5, 18));
    }

    public static int minimizeXor(int num1, int num2) {
        int setBits = Integer.bitCount(num2);
        int bits = 31;
        int res = 0;

        while(bits >= 0 && setBits > 0){
            if((num1 & (1 << bits)) != 0){
                res = res | (1 << bits);
                setBits--;
            }
            bits--;
        }

        bits = 0;

        while(setBits > 0 && bits<32){
            if((num1 & (1 << bits)) == 0){
                res = res | (1 << bits);
                setBits--;
            }
            bits++;
        }

        return res;
    }
}
