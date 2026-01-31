class Solution {
    public int longestSubarray(int[] nums) {
        int low = 0, high = 0, res = 0;
        int[] arr = new int[2];
        while(high < nums.length){
            arr[nums[high]] += 1;
            while(arr[0] > 1){
                arr[nums[low]] -= 1;
                low++;
            }
            int len = high - low;
            res = Math.max(res, len);
            high++;
        }
        return res;
    }
}