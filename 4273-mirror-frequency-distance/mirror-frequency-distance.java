class Solution {
    public int mirrorFrequency(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        while(!map.isEmpty()){
            char c = map.keySet().iterator().next();
            char mc = mirror(c);
            int freqc = map.get(c);
            int freqm = map.getOrDefault(mc, 0);
            map.remove(c);
            if(map.get(mc) != null){
                map.remove(mc);
            }
            sum += Math.abs(freqc - freqm);
        }
        return sum;
    }
    char mirror(char c){
        if((int) c > 96){
            return (char)('a' + 'z' - c);
        }else{
            return (char)('0' + '9' - c);
        }
    }
}