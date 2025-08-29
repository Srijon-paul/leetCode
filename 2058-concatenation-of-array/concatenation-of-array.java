class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int i = 0;
        while( i < nums.length){
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
            i++;
        }
        return ans;
    }
}