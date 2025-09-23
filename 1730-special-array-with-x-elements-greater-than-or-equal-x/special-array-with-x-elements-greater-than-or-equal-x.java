class Solution {
    public int specialArray(int[] nums) {
        int x = 1;
        while(x <= nums.length){
            int count = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] >= x && count <= x){
                    count++;
                }
            }
            if(count == x){
                return x;
            } else{
                x++;
            }
        }
        return -1;
    }
}