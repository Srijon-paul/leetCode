class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> have = new HashMap<>();
        for(int i = 0; i < ransomNote.length(); i++){
            need.put(ransomNote.charAt(i), need.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }
        for(int i = 0; i < magazine.length(); i++){
            have.put(magazine.charAt(i), have.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        return doesHave(need, have);
    }
    boolean doesHave(HashMap<Character, Integer> need, HashMap<Character, Integer> have){
        for(Character key: need.keySet()){
            if(have.get(key) == null) return false;
            int fneed = need.get(key);
            int fhave = have.get(key);
            if(fhave < fneed) return false;
        }
        return true;
    }
}