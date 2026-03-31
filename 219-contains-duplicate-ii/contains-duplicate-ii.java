class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int low = 0;
        boolean res = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i], i);
            }else{
                int len = i - map.get(nums[i]);
                if(len > k){
                    map.put(nums[i], i);
                }else{
                    res = true;
                }
            }
        }
        return res;
    }
}