import java.util.Stack;

class Solution {
    public static void main(String[] args){
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int[] expectedNums = {0, 1, 4, 0, 3};
        int k = removeElement(nums, val);

        assert k == expectedNums.length;
        for (int i = 0; i < nums.length; i++) {
            assert nums[i] == expectedNums[i];
        }
        System.out.println("k: " + k);
        for(int n : nums){
            System.out.println("n: " + n);
        }
    }

    public static int removeElement(int[] nums, int val) {
        int j = 0;
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[j] = nums[i];
                stk.push(nums[i]);
                j++;
            }
        }

        return stk.size();
    }
}

