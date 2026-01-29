class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[256];
        int low = 0; int high = 0; int res = 0;
        while(high < s.length()){
            arr[s.charAt(high)] += 1;
            int len = high - low + 1;
            int max = maxVal(arr);
            int diff = len - max;
            while(diff > k){
                arr[s.charAt(low)] -= 1;
                low++;
                len = high - low + 1;
                max = maxVal(arr);
                diff = len - max;
            }
            len = high - low + 1;
            res = Math.max(res, len);
            high++;
        }
        return res;
    }
    public int maxVal(int[] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}