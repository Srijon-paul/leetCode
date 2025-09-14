class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int target = -nums[i];
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                if(nums[j] + nums[k] == target){
                    List<Integer> intlist = new ArrayList<>();
                    intlist.add(nums[i]);
                    intlist.add(nums[j]);
                    intlist.add(nums[k]);
                    list.add(intlist);
                    while(j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while(j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++; k--;
                } else{
                    if(target > nums[j] + nums[k]){
                        j++;
                    } else{
                        k--;
                    }
                }
                while(i + 1 < nums.length && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
        }
        return list;
    }
}