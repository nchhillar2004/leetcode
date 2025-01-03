// Beats 32%
class Solution {
    public int myAtoi(String s) {
        int num = 0;
        int sign = 1, i = 0;
        String temp = s.strip();
        
        if (i < temp.length() && (temp.charAt(i) == '-' || temp.charAt(i) == '+')) {
            sign = temp.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        
        while (i < temp.length() && Character.isDigit(temp.charAt(i))) {
            int lastDigit = temp.charAt(i) - '0';
            if (num > (Integer.MAX_VALUE - lastDigit) / 10)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            num = num*10 + lastDigit;
            i++;
        }
        
        return sign * num;
    }
}
