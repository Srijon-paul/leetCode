class Solution {
    public int findMaxLength(int[] nums) {
        int zero = 0, one = 0, res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zero++;
            } else{
                one++;
            }
            int diff = zero - one;
            if(diff == 0){
                res = Math.max(res, i + 1);
                continue;
            }
            if(map.get(diff) == null){
                map.put(diff, i);
            }else{
                int len = i - map.get(diff);
                res = Math.max(res, len);
            }
        }
        return res;
    }
}