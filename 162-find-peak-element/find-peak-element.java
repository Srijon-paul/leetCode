class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length - 2;
        int res = Integer.MIN_VALUE;
        while(low <= high){
            int guess = (low + high) / 2;
            if(nums[guess] < nums[guess + 1]){
                res = guess + 1;
                low = guess + 1;
            }else{
                high = guess - 1;
            }
        }
        if(res == Integer.MIN_VALUE){
            return 0;
        }
        return res;
    }
}