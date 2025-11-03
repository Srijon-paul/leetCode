class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums.length == 1){
            list.add(nums[0]);
            return list;
        }
        for(int i = 0; i < nums.length; i++){
            int count = 1;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > nums.length / 3 && !list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        return list;
    }
}