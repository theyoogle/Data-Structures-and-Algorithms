package string_backspace;

import java.util.Stack;

public class Solution_01 {

    public static String buildString(String s) {
        Stack<Character> cleanString = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '#') {
                cleanString.pop();
            } else {
                cleanString.push(ch);
            }
        }

        return String.valueOf(cleanString);
    }

    public static void main(String[] args) {
        String s = "ab#cd##c";
        String t = "az#c";
        System.out.println(buildString(s).equals(buildString(t)));
    }
}
