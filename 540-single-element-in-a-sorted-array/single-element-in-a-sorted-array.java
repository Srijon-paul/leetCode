class Solution {
    public int singleNonDuplicate(int[] nums) {
        int c = 0;

        for(int n : nums){
            c = c ^ n;
        }
        return c;
    }
}