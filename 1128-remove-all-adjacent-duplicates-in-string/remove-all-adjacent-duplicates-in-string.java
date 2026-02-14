class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        String res = "";
        for(int i = 0; i < s.length(); i++){
            if(st.empty()){
                st.push(s.charAt(i));
                continue;
            }
            if(st.peek() == s.charAt(i)){
                st.pop();
                continue;
            }
            st.push(s.charAt(i));
        }
        while(!st.empty()){
            res += st.pop();
        }
        for(int i = 0; i < res.length(); i++){
            st.push(res.charAt(i));
        }
        res = "";
        while(!st.empty()){
            res += st.pop();
        }
        return res;
    }
}