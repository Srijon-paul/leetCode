class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
                continue;
            }
            if(st.empty()) return false;
            if(s.charAt(i) == ')' && st.peek() == '('){
                st.pop();
                continue;
            }
            if(s.charAt(i) == '}' && st.peek() == '{'){
                st.pop();
                continue;
            }
            if(s.charAt(i) == ']' && st.peek() == '['){
                st.pop();
                continue;
            }
            st.push(s.charAt(i));
        }
        if(!st.empty()) return false;
        return true;
    }
}