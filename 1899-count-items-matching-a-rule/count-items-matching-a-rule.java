class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0 ;
        if(ruleKey.equals("type")){
            for (List<String> item : items) {
                if (item.getFirst().equals(ruleValue)) {
                    count++;
                }
            }
        }
        if(ruleKey.equals("color")){
            for (List<String> item : items) {
                if (item.get(1).equals(ruleValue)) {
                    count++;
                }
            }
        }
        if(ruleKey.equals("name")){
            for (List<String> item : items) {
                if (item.get(2).equals(ruleValue)) {
                    count++;
                }
            }
        }
        return count;
    }
}