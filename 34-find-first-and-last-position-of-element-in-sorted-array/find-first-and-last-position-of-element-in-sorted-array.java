class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums, target), last(nums, target)};
    }
    int first(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        int res = -1;
        while(low <= high){
            int guess = (low + high) / 2;
            if(arr[guess] < target){
                low = guess + 1;
            }
            else if(arr[guess] > target){
                high = guess - 1;
            }
            else{
                res = guess;
                high = guess - 1;
            }
        }
        return res;
    }
    int last(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        int res = -1;
        while(low <= high){
            int guess = (low + high) / 2;
            if(arr[guess] < target){
                low = guess + 1;
            }
            else if(arr[guess] > target){
                high = guess - 1;
            }
            else{
                res = guess;
                low = guess + 1;
            }
        }
        return res;
    }
}