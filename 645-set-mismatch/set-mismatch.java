class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int[] arr = new int[2];
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                arr[0] = nums[i + 1];
                arr[1] = nums[i + 1] + ((nums.length*(nums.length + 1) / 2) - sum);
                break;
            }
        }
        return arr;
    }
}