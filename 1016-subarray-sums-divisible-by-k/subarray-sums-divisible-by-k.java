class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0, res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int rem = sum % k;
            int freq;
            if(rem < 0){
                rem += k;
            }
            if(map.get(rem) != null){
                freq = map.get(rem);
            } else{
                freq = 0;
            }
            if(map.get(rem) != null){
                map.put(rem, map.get(rem) + 1);
            } else{
                map.put(rem, 1);
            }
            res += freq;
        }
        return res;
    }
}