class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int[] nums2 = new int[nums.length];
        int sum = 0, count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                nums2[i] = 0;
            }else{
                nums2[i] = 1;
            }
        }
        for(int i = 0; i < nums2.length; i++){
            sum += nums2[i];
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            if(map.get(sum - k) != null){
                count += map.get(sum - k);
            }
        }
        return count;
    }
}