class Solution {
    public String minWindow(String s, String t) {
        int[] arrS = new int[256];
        int[] arrT = new int[256];
        int low = 0, high = 0, res = Integer.MAX_VALUE;
        int start = 0;
        for(int i = 0; i < t.length(); i++){
            arrT[t.charAt(i)] += 1;
        }
        while(high < s.length()){
            arrS[s.charAt(high)] += 1;
            while(check(arrS, arrT)){
                int len = high - low + 1;
                if(res > len){
                    res = len;
                    start = low;
                }
                arrS[s.charAt(low)] -= 1;
                low++;
            }

            high++;
        }
        if(res == Integer.MAX_VALUE){
            return "";
        } else{
            return s.substring(start, start + res);
        }
    }
    public boolean check(int[] arrS, int[] arrT){
        for(int i = 0; i < 256; i++){
            if(arrS[i] < arrT[i]){
                return false;
            }
        }
        return true;
    }
}