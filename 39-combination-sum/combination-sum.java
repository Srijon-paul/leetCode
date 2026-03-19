class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int index = 0, n = candidates.length, sum = 0;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        helper(index, candidates, n, list, res, sum ,target);
        return res;
    }
    void helper(int index, int[] candidates, int n, List<Integer> list, List<List<Integer>> res, int sum, int target){
        if(index == n){
            if(sum == target){
                res.add(new ArrayList<>(list));
            }
            return;
        }
        helper(index + 1, candidates, n, list, res, sum ,target);
        if(candidates[index] + sum <= target){
            sum += candidates[index];
            list.add(candidates[index]);
            helper(index, candidates, n, list, res, sum ,target);
            sum -= candidates[index];
            list.remove(list.size() - 1);
        }
        return;
    }
}