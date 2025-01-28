// Leetcode daily challenge: Neighboring Bitwise XOR --> Optimal solution

public class NeighborBitXOR {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0 };
        System.out.println(doesValidArrayExist(arr));
    }

    public static boolean doesValidArrayExist(int[] derived) {
        int xorResult = derived[0];

        for (int i = 1; i < derived.length; i++) {
            xorResult = xorResult ^ derived[i];
        }

        return xorResult == 0;
    }
}
