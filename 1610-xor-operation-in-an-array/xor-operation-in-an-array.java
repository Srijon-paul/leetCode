class Solution {
    public int xorOperation(int n, int start) {
        int bit = 0;
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = start + (2 * i);
            bit = bit ^ nums[i];
        }
        return bit;
    }
}