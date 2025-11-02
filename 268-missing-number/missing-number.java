class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = ((n)*(n+1)) / 2;
        n = 0;
        for(int i = 0; i < nums.length; i++){
            n += nums[i];
        }
        return total - n;
    }
}