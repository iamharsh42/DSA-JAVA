
// In this java program we will find the ceiling of a number in a given array
import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = { 2, 4, 7, 10, 12, 14, 17, 20 };
        System.out.print("Enter the target element: ");
        int target = input.nextInt();
        int ans = findCeiling(array, target);
        if (ans == -1) {
            System.out.println("Ceiling dosent exist.");
        } else {
            System.out.println("Ceiling of the given number is " + array[ans] + " found at index " + ans);
        }
    }

    static int findCeiling(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int low = 0;
        int high = arr.length - 1;
        while (high >= low) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}