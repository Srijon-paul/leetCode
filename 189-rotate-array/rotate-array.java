class Solution {
    public void rotate(int[] nums, int k) {
        if(k == 0 || nums.length == 1){
            return;
        }
        k = k % nums.length;
        int temp = k;
        int[] arr2 = Arrays.copyOf(nums, nums.length);
        int i = 0;
        while(k != 0){
            nums[i] = arr2[arr2.length - k];
            i++; k--;
        }
        while(k != arr2.length - temp){
            nums[i] = arr2[k];
            k++; i++;
        }
    }
}