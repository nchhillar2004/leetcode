// runtime: 1ms, Beats: 5%
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int count = 0;
        int x = 0;

        while (x < n){
            for (int i = 0; i < n; i++){
                if (sorted[i] == nums[(i+x) % n]) count++;
                else break;
            }
            if (count == n) return true;
            count = 0;
            x++;
        }

        return false;
    }
}
