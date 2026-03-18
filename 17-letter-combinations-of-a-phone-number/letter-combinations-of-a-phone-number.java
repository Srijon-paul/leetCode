class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        int n = digits.length();
        List<String> list = new ArrayList<>();
        int idx = 0;
        String tmp = "";
        helper(idx, n, tmp, digits, list, map);
        return list;
    }
    void helper(int idx, int n, String tmp, String digits, List<String> list, HashMap<Character, String> map){
        if(idx == n){
            list.add(tmp);
            return;
        }
        String choice = map.get(digits.charAt(idx));
        for(int j = 0; j < choice.length(); j++){
            tmp += choice.charAt(j);
            helper(idx + 1, n, tmp, digits, list, map);
            tmp = tmp.substring(0, tmp.length() - 1);
        }
        return;
    }
}