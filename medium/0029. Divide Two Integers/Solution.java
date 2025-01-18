// Beats 5%
class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 1) return dividend;
        long result = 0;
        if (dividend == 0) return (int) result;
        
        int max = Integer.MAX_VALUE, min = Integer.MIN_VALUE;
        if (dividend == min && divisor == -1) return max;
        if (dividend == max && divisor == -1) return min+1;

        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        while (a >= b){
            a -= b;
            ++result;
        }

        if (result > max) result = max;
        else if (result < min) result = min;

        return (int) result*sign;
    }
}
