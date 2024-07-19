import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a string: ");
        String str = input.next();
        int ans = isPalindrome(str);
        if (ans == 1) {
            System.out.println("Panindrome number");
        } else if (ans == -1) {
            System.out.println("Not a palindrome number");
        }
    }

    static int isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                return -1;
            }
        }

        return 1;
    }
}
