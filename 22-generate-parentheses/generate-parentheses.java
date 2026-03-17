class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        int open = 0, close = 0;
        String tmp = "";
        helper(open, close, n, tmp, list);
        return list;
    }
    void helper(int open, int close, int n, String tmp, List<String> list){
        if(open == n && close == n){
            list.add(tmp);
            return;
        }
        if(open < n){
            tmp += "(";
            helper(open + 1, close, n, tmp, list);
            tmp = tmp.substring(0, tmp.length() - 1);
        }
        if(close < open){
            tmp += ")";
            helper(open, close + 1, n, tmp, list);
            tmp = tmp.substring(0, tmp.length() - 1);
        }
        return;
    }
    
}