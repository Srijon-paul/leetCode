class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[nums.length];
        int[] result = new int[2];
        int j = 0;
        arr[0] = 102;
        for(int i = 0; i < arr.length; i++){
            if(nums[i] != arr[nums[i]]){
                arr[nums[i]] = nums[i];
            } else{
                result[j] = nums[i];
                j++;
            }
        }
        return result;
    }
}