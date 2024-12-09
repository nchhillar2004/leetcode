// Runtime -> 4ms, Beats -> 100.00%

class Solution{
    public static void main(String[] args){
        int n = 101;
        boolean result = isPalindrome(n);
        System.out.println(result);
    }

    public static boolean isPalindrome(int x) {
        int reversed = 0;
        int temp = x;
        if (x<0){
            return false;
        } else{
            while (x != 0){
                int lastDigit = x % 10;
                reversed = reversed * 10 + lastDigit;
                x = x / 10;
            }
            if (reversed == temp){
                return true;
            }else{
                return false;
            }
        }
    }
}
