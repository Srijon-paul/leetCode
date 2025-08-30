class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>();
        }
        return helper("", digits);
    }
    public ArrayList<String> helper(String pro, String unpro){
        if(unpro.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = unpro.charAt(0) - '0';
        if(digit >= 2 && digit <= 6){
            for(int i = (digit-2) * 3; i < (digit - 1) * 3; i++){
                char ch = (char)('a' + i);
                ans.addAll(helper(pro + ch, unpro.substring(1)));
            }
        } else{
            if(digit == 7){
                for(int i = 15; i < 19; i++){
                    char ch = (char)('a' + i);
                    ans.addAll(helper(pro + ch, unpro.substring(1)));
                }
            }
            if(digit == 8){
                for(int i = 19; i < 22; i++){
                    char ch = (char)('a' + i);
                    ans.addAll(helper(pro + ch, unpro.substring(1)));
                }
            }
            if(digit == 9){
                for(int i = 22; i < 26; i++){
                    char ch = (char)('a' + i);
                    ans.addAll(helper(pro + ch, unpro.substring(1)));
                }
            }
        }
        return ans;
    }
}