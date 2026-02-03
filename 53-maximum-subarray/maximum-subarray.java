class Solution {
    public int maxSubArray(int[] nums) {
        int BE = nums[0], res = nums[0];
        for(int i = 1; i < nums.length; i++){
            int v1 = BE + nums[i];
            int v2 = nums[i];
            BE = Math.max(v1, v2);
            res = Math.max(BE, res);
        }
        return res;
    }
}