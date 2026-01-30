class Solution {
    public int longestOnes(int[] nums, int k) {
        int[] arr = new int[2];
        int low = 0, high = 0, res = 0;
        while(high < nums.length){
            arr[nums[high]] += 1;
            while(arr[0] > k){
                arr[nums[low]] -= 1;
                low++;
            }
            int len = high - low + 1;
            res = Math.max(res, len);
            high++;
        }
        return res;
    }
}