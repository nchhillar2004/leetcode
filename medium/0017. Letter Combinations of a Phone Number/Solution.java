// Beats 100%
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length()==0)
            return result;
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtrack(digits, 0, new StringBuilder(), result, map);

        return result;
    }
    private void backtrack(String digits, int idx, StringBuilder combo, List<String> res, Map<Character, String> map){
        if (idx == digits.length()){
            res.add(combo.toString());
            return;
        }

        String letters = map.get(digits.charAt(idx));
        for (char letter : letters.toCharArray()){
            combo.append(letter);
            backtrack(digits, idx+1, combo, res, map);
            combo.deleteCharAt(combo.length() - 1);
        }
    }
}
