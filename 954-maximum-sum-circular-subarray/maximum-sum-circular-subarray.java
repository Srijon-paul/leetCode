class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        if(nums.length == 1) return nums[0];
        int BE = nums[0], BE2 = nums[0], res = nums[0], res2 = nums[0];
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum += nums[i];
            int v1 = BE + nums[i];
            int v2 = nums[i];
            int v3 = BE2 + nums[i];
            BE = Math.max(v1, v2);
            res = Math.max(BE, res);
            BE2 = Math.min(v3, v2);
            res2 = Math.min(BE2, res2);
        }
        if(sum == res2){
            return res;
        } else{
            return Math.max(res, sum - res2);
        }
    }
}