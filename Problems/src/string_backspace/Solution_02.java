package string_backspace;

public class Solution_02 {

    public static boolean compare(String str1, String str2) {
        int p1 = str1.length() - 1;
        int p2 = str2.length() - 1;
        int skip1 = 0;
        int skip2 = 0;

        while (p1 >= 0 || p2 >= 0) {

            while (p1 >= 0) {
                if (str1.charAt(p1) == '#') {
                    skip1++;
                    p1--;
                } else if (skip1 > 0) {
                    skip1--;
                    p1--;
                } else {
                    break;
                }
            }

            while (p2 >= 0) {
                if (str2.charAt(p2) == '#') {
                    skip2++;
                    p2--;
                } else if (skip2 > 0) {
                    skip2--;
                    p2--;
                } else {
                    break;
                }
            }

            // comparing character vs nothing
            if ((p1 >= 0) != (p2 >= 0)) {
                return false;
            }

            if (p1 >= 0 && p2 >= 0) {
                if (str1.charAt(p1) == str2.charAt(p2)) {
                    p1--;
                    p2--;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "ab#cd##c";
        String str2 = "az#c";
        System.out.println(compare(str1, str2));
    }
}
