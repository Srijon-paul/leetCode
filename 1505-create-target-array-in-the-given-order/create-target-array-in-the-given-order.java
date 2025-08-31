class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = -1;
            if (arr[index[i]] != -1) {
                int k = i;
                while (k != index[i]) {
                    arr[k] = arr[k - 1];
                    k--;
                }
            }
            arr[index[i]] = nums[i];
        }
        return arr;
    }
}