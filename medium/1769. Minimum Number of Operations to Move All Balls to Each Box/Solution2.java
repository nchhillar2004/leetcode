// My solution Beats 5%
class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] result = new int[n];
        ArrayList<Integer> recorded = new ArrayList<>();

        for (int i = 0; i < n; i++){
            if (boxes.charAt(i) == '1')
                recorded.add(i);
        }

        for(int j = 0; j < n; j++){
            int steps = 0;
            for (int num : recorded){
                steps += Math.abs(j-num);
            }
            result[j] = steps;
        }

        return result;
    }
}
