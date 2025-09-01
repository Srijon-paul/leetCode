class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        return helper(list, nums, nums.length);
    }
    public List<List<Integer>> helper(List<Integer> pro, int[] unpro, int len){
        int[] newarr = Arrays.copyOf(unpro, len);
        List<Integer> newpro = new ArrayList<>(pro);
        if(newarr.length == 0){
            List<List<Integer>> list = new ArrayList<>();
            list.add(pro);
            return list;
        }
        int element = newarr[newarr.length - 1];
        newpro.add(element);
        List<List<Integer>> right = helper(pro, newarr, len -1);
        List<List<Integer>> left = helper(newpro, newarr, len -1);
        right.addAll(left);
        return right;
    }
}