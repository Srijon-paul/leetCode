class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int i = 0;
        int j = n;
        for(int k = 0; k < nums.length; k++){
            if(k%2==0){
                arr[k] = nums[i];
                i++;
            } else{
                arr[k] = nums[j];
                j++;
            }
        }
        return arr;
    }
}