import java.util.Stack;

// TODO: improve time & space complexity
class Solution {
    public static void main(String[] args){
        String s = "characters";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }

    public static int lengthOfLongestSubstring(String s) {
        String newS = "";
        Stack<Integer> indices = new Stack<>();

        int left = 0;
        int right = s.length();

        while (left < right){
            for (int i = left; i < right; i++){
                String temp = String.valueOf(s.charAt(i));
                if (newS.contains(temp)){
                    indices.push(newS.length());
                    newS = "";
                    left ++;
                    break;
                } else{
                    newS += temp;
                }
            }
        }

        int max = (indices.isEmpty()) ? 0 : indices.get(0);

        for (int n : indices){
            if (max < n){
                max = n;
            }
        }


        return max;
    }
}

