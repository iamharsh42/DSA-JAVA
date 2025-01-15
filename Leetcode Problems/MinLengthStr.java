// Leetcode daily challenge: Minimum Length of String After Operations

import java.util.HashMap;
import java.util.Map;

public class MinLengthStr {
    public static void main(String[] args) {
        String str = "abaacbbad";
        System.out.println(minimumLength(str));
    }

    public static int minimumLength(String s) {
        int minLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer> set: map.entrySet()){
            int num = set.getValue();

            if(num%2 == 0){
                minLen += num-2;
            } else {
                minLen += num-1;
            }
        }

        return s.length() - minLen;
    }
}
