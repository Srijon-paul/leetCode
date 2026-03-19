class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int idx = 0;
        boolean[] visited = new boolean[nums.length];
        helper(idx, n, nums, list, res, visited);
        return res;
    }
    void helper(int idx, int n, int[] nums, List<Integer> list, List<List<Integer>> res, boolean[] visited){
        if(idx == n){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(visited[i] == true){
                continue;
            }
            list.add(nums[i]); visited[i] = true;
            helper(idx + 1, n, nums, list, res, visited);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
        return;
    }
}