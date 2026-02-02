class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1){
            return 0;
        }
        int low = 0, high = 0, res = 0;
        int prod = 1;
        while(high < nums.length){
            prod = prod * nums[high];
            while(prod >= k){
                prod = prod / nums[low];
                low++;
            }
            if(prod < k){
                int len = high - low + 1;
                res = res + len;
            }
            high++;
        }
        return res;
    }
}