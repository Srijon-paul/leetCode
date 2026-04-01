class Solution {
    public int scoreOfParentheses(String s) {
        int level = 0;
        int idx = 0, res = 0;
        while(idx < s.length()){
            if(s.charAt(idx) == '('){
                level++; idx++;
                continue;
            }
            if(s.charAt(idx) == ')'){
                level--;
                if(s.charAt(idx - 1) == '('){
                    res += Math.pow(2, level);
                }
            }
            idx++;
        }
        return res;
    }
}