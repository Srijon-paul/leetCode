class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 1; i <= nums.length; i++){
            if(!search(nums, i)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean search(int[] arr, int target){
        int start = 0;
        int last = arr.length - 1;
        int middle;
        while(start <= last){
            middle = (start + (last - start) / 2);
            if(target == arr[middle]){
                return true;
            } else if (target < arr[middle]) {
                last = middle - 1;
            } else{
                start = middle + 1;
            }
        }
        return false;
    }
}