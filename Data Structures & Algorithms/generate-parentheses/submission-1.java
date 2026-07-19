class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        backtrack(str, 0, 0, res, n);
        return res;
        
    }

    public void backtrack(StringBuilder str, int open, int close, List<String> res, int n){
        if(open + close == 2*n){
            res.add(new StringBuilder(str).toString());
            return;
        }

        if(open < n){
            str.append("(");
            backtrack(str, open + 1, close, res, n);
            str.deleteCharAt(str.length() - 1);

        }

        if(close < open){
            str.append(")");
            backtrack(str, open, close + 1, res, n);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
