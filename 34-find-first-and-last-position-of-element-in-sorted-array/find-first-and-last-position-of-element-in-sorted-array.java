class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1};
        if(nums.length == 1 && target == nums[0]){
            return new int[]{0, 0};
        }
        int start = 0;
        int end = nums.length - 1;
        int mid; int midHolder;
        while(start <= end){
            mid = (start + (end - start) / 2);
            midHolder = mid;
            if(nums[mid] == target){
                arr[0] = mid;
                while(mid > 0 && nums[mid - 1] == target){
                    arr[0] = mid - 1;
                    mid--;
                }
                mid = midHolder;
                while(mid < nums.length && nums[mid] == target){
                    arr[1] = mid;
                    mid++;
                }
                break;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return arr;
    }
}