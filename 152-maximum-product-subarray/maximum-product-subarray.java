class Solution {
    public int maxProduct(int[] nums) {
        int BE = nums[0], WE = nums[0], res = nums[0];
        for(int i = 1; i < nums.length; i++){
            int v1 = BE * nums[i];
            int v2 = WE * nums[i];
            int v3 = nums[i];
            BE = Math.max(v3, Math.max(v1, v2));
            WE = Math.min(v3, Math.min(v1, v2));
            res = Math.max(res, Math.max(BE, WE));
        }
        return res;
    }
}