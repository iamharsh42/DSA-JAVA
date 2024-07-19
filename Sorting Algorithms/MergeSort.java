import java.util.*;

public class MergeSort {
    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array to store elements
        int left = low; // starting index of left half
        int right = mid + 1; // starting index of right half

        // storing elements in temp array in sorted manner

        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements in left half are still left

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // if elements in right half are still left

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temp array to actual array

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid); // left half
        mergeSort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high); // merging the sorted halfs
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 7, 3, 4, 5 };
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        mergeSort(arr, 0, 5);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}