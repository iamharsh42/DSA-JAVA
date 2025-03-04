// Leetcode daily challenge: Check if Number is a Sum of Powers of Three --> Optimal solution (04/03/2025)

public class PowOfThree{
    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(12));
    }

    public static boolean checkPowersOfThree(int n) {
        while(n > 0){
            if(n%3 == 2){
                return false;
            }
            n = n/3;
        }
        return true;
    }

}