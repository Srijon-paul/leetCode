class Solution {
    public String removeOccurrences(String s, String part) {
        if(s.length() < part.length()) return s;
        Stack<Character> st = new Stack<>();
        int i = part.length() - 1, j = 0;
        String res = "";
        while(j < s.length()){
            st.push(s.charAt(j));
            while(i >= 0 && !st.isEmpty() && st.peek() == part.charAt(i)){
                st.pop();
                i--;
                if(i >= 0 && st.isEmpty() && j < s.length()){
                    while(i != part.length() - 1){
                        i++;
                        st.push(part.charAt(i));
                    }
                    break;
                }
                if(i >= 0 && !st.isEmpty() && st.peek() != part.charAt(i)){
                    while(i != part.length() - 1){
                        i++;
                        st.push(part.charAt(i));
                    }
                    break;
                }
            }
            if(i == -1){
                i = part.length() - 1;
            }
            j++;
        }
        while(!st.isEmpty()){
            res = st.peek() + res;
            st.pop();
        }
        return res;
    }
}