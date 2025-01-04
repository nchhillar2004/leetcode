import java.util.*;

// Beats 87%
class Solution{
    public static void main(String[] args){
        String s = "tlpjzdmtwderpkpmgoyrcxttiheassztncqvnfjeyxxp";
        int result = countPalindromicSubsequence(s);
        System.out.println("Result: " + result); // 4
    }
    public static int countPalindromicSubsequence(String s) {
        int len = s.length();
        HashSet<Character> prefix = new HashSet<>();
        int result = 0;

        for (int start = 0; start < len - 2; start++) {
            char firstChar = s.charAt(start);
            if (prefix.contains(firstChar)) continue;
            prefix.add(firstChar);

            int end = s.lastIndexOf(firstChar);
            if (end >= start + 2) {
                boolean[] middleChars = new boolean[26];
                for (int j = start + 1; j < end; j++) {
                    char middleChar = s.charAt(j);
                    if (!middleChars[middleChar - 'a']) {
                        middleChars[middleChar - 'a'] = true;
                        result++;
                    }
                }
            }
        }

        return result;
    }
}

