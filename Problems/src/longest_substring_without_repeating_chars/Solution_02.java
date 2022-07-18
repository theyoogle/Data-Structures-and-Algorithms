package longest_substring_without_repeating_chars;

import java.util.HashMap;

public class Solution_02 {

    public static int longestSubstringLength(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int longest = 0;
        int L = 0;

        for (int R=0; R<s.length(); R++) {
            char ch = s.charAt(R);
            if (map.containsKey(ch)) {
                int index = map.get(ch);
                if (index >= L) {
                    L = map.get(ch) + 1;
                }
            }
            map.put(ch, R);

            int count = R-L+1;
            if (count > longest) {
                longest = count;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
//        String str = "abcabcbb";
//        String str = "pwwkew";
        String str = " ";
//        String str = "au";
//        String str = "abba";
//        String str = "aa";
        System.out.println(longestSubstringLength(str));
    }

}
