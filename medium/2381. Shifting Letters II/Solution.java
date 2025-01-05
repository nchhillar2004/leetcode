import java.util.*;

class Solution{
    public static void main(String[] args){
        String s = "dztz";
        int[][] shifts = {{0,0,0},{1,1,1}};
        String result = shiftingLetters(s, shifts);
        System.out.println("Result: " + result);
    }
    public static String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] netShifts = new int[n + 1];

        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];

            netShifts[start] += (direction == 1 ? 1 : -1);
            if (end + 1 < n) {
                netShifts[end + 1] -= (direction == 1 ? 1 : -1);
            }
        }

        int shiftSum = 0;
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < n; i++) {
            shiftSum += netShifts[i];
            int newChar = ((result.charAt(i) - 'a' + shiftSum) % 26 + 26) % 26 + 'a';
            result.setCharAt(i, (char) newChar);
        }

        return result.toString();
    }
}

