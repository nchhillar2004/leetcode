class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        recurse(result, 0, 0, "", n);

        return result;
    }
    private void recurse(List<String> res, int open, int close, String s, int n){
        if (open == close && open + close == n*2){
            res.add(s);
            return;
        }

        if(open < n){
            recurse(res, open+1, close, s + "(", n);
        }

        if (close < open){
            recurse(res, open, close+1, s + ")", n);
        }
    }
}
