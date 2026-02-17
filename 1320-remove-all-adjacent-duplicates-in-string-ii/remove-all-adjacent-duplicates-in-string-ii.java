class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        Stack<Pair<Character, Integer>> st = new Stack<>();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(st.empty()){
                st.push(new Pair<>(c, 1));
                continue;
            }
            Pair<Character, Integer> pair = st.peek();
            if(pair.getKey() != c){
                st.push(new Pair<>(c, 1));
                continue;
            }
            if(pair.getValue() < (k-1)){
                Pair<Character, Integer> p = st.peek();
                st.pop();
                st.push(new Pair<>(p.getKey(), p.getValue() + 1));
                continue;
            }
            st.pop();
        }
        String res = "";
        while(!st.empty()){
            Pair<Character, Integer> p = st.peek();
            st.pop();
            int t = p.getValue();
            while(t > 0){
                res += p.getKey();
                t--;
            }
        }
        StringBuilder sb = new StringBuilder(res);
        sb.reverse();
        String realRes = sb.toString();
        return realRes;
    }
}