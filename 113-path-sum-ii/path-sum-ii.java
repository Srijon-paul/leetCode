/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();
        helper(root, 0, list, targetSum);
        return res;
    }
    void helper(TreeNode root, int sum, List<Integer> list, int target){
        if(root == null){
            return;
        }
        sum += root.val;
        list.add(root.val);
        if(root.left == null && root.right == null){
            if(sum == target){
                res.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
                return;
            }
        }
        helper(root.left, sum, list, target);
        helper(root.right, sum, list, target);
        list.remove(list.size() - 1);
        return;
    }
}