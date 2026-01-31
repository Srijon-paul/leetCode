class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 0;
        int check = 1;
        int k = 1;
        int rep = 1;
        while(check < nums.length){
            if(nums[check] != nums[check - 1]){
                rep = 1;
            }
            if(nums[check] == nums[check - 1] && rep >= 2){
                check++;
                continue;
            } else if(nums[check] == nums[check - 1] && rep < 2){
                nums[start + 1] = nums[check];
                start++; check++; rep++; k++;
            } else{
                nums[start + 1] = nums[check];
                start++; check++; k++;
            }
        }
        return k;
    }
}