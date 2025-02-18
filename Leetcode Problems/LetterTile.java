// Leetcode daily challenge: Letter Tile Possibilities --> Optimal solution (17/02/2025)

public class LetterTile {
    static int len;

    public static void main(String[] args) {
        System.out.println(numTilePossibilities("AAB"));
    }

    static int numTilePossibilities(String tiles) {
        len = tiles.length();
        int[] freq = new int[26];
        for(int i=0; i<len; i++){
            freq[tiles.charAt(i) -'A']++;
        }
        int count = backtrack(freq);
        return count;
    }

    static int backtrack(int[] freq){
        int count = 0;
        for(int i=0; i<26; i++){
            if(freq[i] == 0) continue;
            count++;
            freq[i]--;
            count += backtrack(freq);
            freq[i]++;
        }

        return count;
    }
}
