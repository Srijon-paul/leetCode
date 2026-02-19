class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> f = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            f.put(s.charAt(i), f.getOrDefault(s.charAt(i) , 0) + 1);
        }
        boolean odd = false;
        int res = 0;
        for(Character c : f.keySet()){
            int val = f.get(c);
            if(val % 2 == 0){
                res += val;
            }else{
                odd = true;
            }
        }
        if(odd == false) return res;
        for(Character c : f.keySet()){
            int val = f.get(c);
            if(val % 2 == 1) res += val - 1;
        }
        return res + 1;
    }
}