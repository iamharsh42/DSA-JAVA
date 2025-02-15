// Leetcode daily challenge: Punishment Number --> Optimal solution (15/02/2025)

public class PunishmentNumber {
    public static void main(String[] args) {
        System.out.println(punishmentNumber(10));
    }

    static int punishmentNumber(int n) {
        int res = 0;

        for(int i=1; i<=n; i++){
            String squareVal = Integer.toString(i*i);
            if(isPartition(0, squareVal, i, 0)){
                res += (i*i);
            }
        }

        return res;
    }

    static boolean isPartition(int j, String num, int i, int currVal){
        int n = num.length();

        if(j == n){
            return (currVal == i);
        }

        if(currVal > i){
            return false;
        }

        for(int partitionIndex=j; partitionIndex < n; partitionIndex++){
            int val = Integer.parseInt(num.substring(j, partitionIndex+1));
            if(isPartition(partitionIndex+1, num, i, currVal + val)){
                return true;
            }
        }

        return false;
    }
}