class Solution {
    public int maxAbsoluteSum(int[] nums) {
        if(nums.length == 1){
            return Math.abs(nums[0]);
        }
        int BE = nums[0], WE = nums[0], res = 0;
        for(int i = 1; i < nums.length; i++){
            res = Math.max(res, Math.max(Math.abs(BE), Math.abs(WE)));
            int v1 = BE + nums[i];
            int v2 = nums[i];
            int v3 = WE + nums[i];
            BE = Math.max(v1, v2);
            WE = Math.min(v3, v2);
            res = Math.max(res, Math.max(Math.abs(BE), Math.abs(WE)));
        }
        return res;
    }
}