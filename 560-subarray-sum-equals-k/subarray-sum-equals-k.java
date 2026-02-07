class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int ques = sum - k;
            int freq;
            if(map.get(ques) != null){
                freq = map.get(ques);
            } else{
                freq = 0;
            }
            if(map.get(sum) != null){
                map.put(sum, map.get(sum) + 1);
            } else{
                map.put(sum, 1);
            }
            res += freq;
        }
        return res;
    }
}