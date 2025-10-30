class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int i = 0;
        while(!prefix.isEmpty()){
            int j = 0;
            while(j < strs.length){
                if(!strs[j].startsWith(prefix)){
                    if(!prefix.isEmpty()){
                        prefix = prefix.substring(0, prefix.length() - 1);
                        break;
                    }
                }
                j++;
            }
            if(j == strs.length){
                return prefix;
            }
        }
        return "";
    }
}