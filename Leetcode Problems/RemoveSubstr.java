// Leetcode daily challenge: Remove All Occurrences of a Substring --> Optimal solution

public class RemoveSubstr {
    public static void main(String[] args) {
        String str = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeOccurrences(str, part));
    }

    public static String removeOccurrences(String s, String part) {
        StringBuilder res = new StringBuilder(s);

        while(res.indexOf(part) != -1){
            res.delete(res.indexOf(part), res.indexOf(part) + part.length());
        }

        return res.toString();
    }
}
