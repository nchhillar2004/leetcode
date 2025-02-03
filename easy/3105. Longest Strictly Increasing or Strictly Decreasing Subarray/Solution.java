// runtime: 1ms, Beats: 93%
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length-1;
        int count = 1;
        for (int i = 0; i<n; i++){
            int j = i, tempCount = 1;
            if (nums[j] > nums[j+1]){
                while (j < n && nums[j] > nums[j+1]){
                    tempCount++;
                    j++;
                }
            } else if (nums[j] < nums[j+1]){
                while (j < n && nums[j] < nums[j+1]){
                    tempCount++;
                    j++;
                }
            }
            count = Math.max(tempCount, count);
        }
        return count;
    }
}
