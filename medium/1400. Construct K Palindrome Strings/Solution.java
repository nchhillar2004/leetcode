// Beats 100%
class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) return false;
        if (s.length() == k) return true;

        int odd = 0;

        for (char ch : s.toCharArray())
            odd ^= 1 << (ch - 'a');
        
        return Integer.bitCount(odd) <= k;
    }
}
