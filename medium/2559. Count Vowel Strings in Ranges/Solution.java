class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] nums = new int[queries.length];
        int[] prefixVowelCount = new int[n + 1];
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        
        for (int i = 0; i < n; i++) {
            String word = words[i];
            if (vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length() - 1))) {
                prefixVowelCount[i + 1] = prefixVowelCount[i] + 1;
            } else {
                prefixVowelCount[i + 1] = prefixVowelCount[i];
            }
        }
        
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            nums[i] = prefixVowelCount[right + 1] - prefixVowelCount[left];
        }
        
        return nums;
    }
}
