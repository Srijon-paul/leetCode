class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 0;
        int k = 1;
        int checker = 1;
        while(checker < nums.length){
            if(nums[checker] == nums[checker - 1]){
                checker++;
            } else{
                nums[start + 1] = nums[checker];
                start++; checker++; k++;
            }
        }
        return k;
    }
}