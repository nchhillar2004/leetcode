class Solution {
    public int searchInsert(int[] nums, int target) {
        int startingPoint = 0;
        int endingPoint = nums.length - 1;

        while (startingPoint <= endingPoint){
            int mid = startingPoint + (endingPoint - startingPoint)/2;
            if(nums[mid] < target){
                startingPoint = mid + 1;
            }else if(nums[mid] > target){
                endingPoint = mid - 1;
            }else{
                return mid;
            }
        }

        return startingPoint;
    }
}
