// Beats 18%
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            for (String str : words){
                if (str.length() < words[i].length() && words[i].contains(str) && !result.contains(str)) result.add(str);
            }
        }

        return result;
    }
}
