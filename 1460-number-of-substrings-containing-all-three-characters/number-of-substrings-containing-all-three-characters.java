class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int low = 0, high = 0;
        int res = 0;
        while(high < s.length()){
            map.put(s.charAt(high), map.getOrDefault(s.charAt(high), 0) + 1);
            while(map.size() == 3){
                res += (s.length() - high);
                map.put(s.charAt(low), map.get(s.charAt(low)) - 1);
                if(map.get(s.charAt(low)) == 0){
                    map.remove(s.charAt(low));
                }
                low++;
            }
            high++;
        }
        return res;
    }
}