package longest_substring_without_repeating_chars;

import java.util.HashMap;

public class Solution_01 {

    public static int longestSubstringLength(String s) {
        int longestCount = 0;
        for (int i=0; i<s.length(); i++) {
            HashMap<Character, Boolean> map = new HashMap<>();
            int count = 0;

            for (int j=i; j<s.length(); j++) {
                char ch = s.charAt(j);
                if (map.containsKey(ch)) {
                    break;
                } else {
                    map.put(ch, true);
                }
                count++;
            }

            if (count > longestCount) {
                longestCount = count;
            }
        }
        return longestCount;
    }

    public static void main(String[] args) {
//        String str = "abcabcbb";
        String str = "pwwkew";
//        String str = " ";
        System.out.println(longestSubstringLength(str));
    }
}
