class Solution{
    public static void main(String[] args){
        int[] n = {3, 3};
        int t = 6;
        int[] result = twoSum(n, t);
        System.out.println(java.util.Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] resultArray = new int[2];
        int endingPoint = nums.length;
        for (int startingPoint = 0; startingPoint < endingPoint; startingPoint++){
            for (int i = startingPoint+1; i < endingPoint; i++){
                if (nums[startingPoint] + nums[i] == target){
                    resultArray[0] = startingPoint;
                    resultArray[1] = i;
                    break;
                }
            }
        }
        return resultArray;
    }
}
