class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int i = 0;
        while( i < 2 * nums.length){
            if( i < nums.length){
                ans[i] = nums[i];
                i++;
            } else{
                ans[i] = nums[i - nums.length];
                i++;
            }
        }
        return ans;
    }
}