// Leetcode easy: Word Pattern

import java.util.HashMap;

public class Word_Pattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(wordPattern(pattern, str));
    }

    static boolean wordPattern(String pattern, String s) {
        if (pattern.length() != wordCount(s)) {
            return false;
        }

        boolean isIso = true;
        String[] strList = parseString(s, wordCount(s));
        HashMap<Character, String> map = new HashMap<>();
        int i = 0;

        while (i < pattern.length()) {
            char ch1 = pattern.charAt(i);
            String str = strList[i];
            i++;

            if (map.containsKey(ch1)) {
                if (!map.get(ch1).equals(str)) {
                    isIso = false;
                    break;
                }
            } else {
                if (map.containsValue(str)) {
                    isIso = false;
                    break;
                } else {
                    map.put(ch1, str);
                }
            }
        }

        return isIso;
    }

    static String[] parseString(String str, int n) {
        int len = str.length();
        StringBuilder word = new StringBuilder();
        int arrIndex = 0;
        String[] list = new String[n];
        int i = 0;
        while (i < len) {
            if (str.charAt(i) != ' ') {
                word.append(str.charAt(i));
            } else {
                list[arrIndex] = word.toString();
                arrIndex++;
                word.setLength(0);
            }
            i++;
        }

        if (word.length() > 0) {
            list[arrIndex] = word.toString();
        }

        return list;
    }

    static int wordCount(String str) {
        int gaps = 0;
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == ' ') {
                gaps++;
            }
            i++;
        }

        return gaps + 1;
    }
}

// improvements:
// use str.split(" ");
// use patter.toCharArray();
