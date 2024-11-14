// Leetcode medium: Container With Most Water

public class Container {
    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        int maxArea = maxArea(height);
        System.out.println(maxArea);
    }

    static int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int b1 = 0;
        int b2 = height.length - 1;

        while (b1 < b2) {
            int area;
            if (height[b1] < height[b2]) {
                area = (b2 - b1) * height[b1];
                max = Math.max(max, area);
                b1++;
            } else {
                area = (b2 - b1) * height[b2];
                max = Math.max(max, area);
                b2--;
            }
        }

        return max;
    }
}