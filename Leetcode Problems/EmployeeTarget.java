// Leetcode easy : Number of Employees Who Met the Target

public class EmployeeTarget {
    public static void main(String[] args) {
        int[] hours = { 2, 5, 3, 7, 6, 5 };
        int target = 3;
        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for (int hour : hours) {
            if (hour >= target)
                count++;
        }

        return count;
    }
}
