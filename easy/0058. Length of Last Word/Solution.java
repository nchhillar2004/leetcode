class Solution {
    public int lengthOfLastWord(String s) {
        String regex = " ";
        String[] arr = s.split(regex);
        return arr[arr.length - 1].length();
    }
}
