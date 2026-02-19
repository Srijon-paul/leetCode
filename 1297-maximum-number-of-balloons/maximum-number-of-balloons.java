class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> have = new HashMap<>();
        for(int i = 0; i < text.length(); i++){
            have.put(text.charAt(i), have.getOrDefault(text.charAt(i), 0) + 1);
        }
        HashMap<Character, Integer> need = new HashMap<>();
        need.put('b', 1); need.put('a', 1); need.put('l', 2); need.put('o', 2); need.put('n', 1);
        int res = Integer.MAX_VALUE;
        for(Character c : need.keySet()){
            if(have.get(c) == null) return 0;
            int fneed = need.get(c);
            int fhave = have.get(c);
            int times = fhave / fneed;
            res = Math.min(res, times);
        }
        return res;
    }
}