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
    int wrong = 0;
    TreeNode prev = null;
    TreeNode w1first = null;
    TreeNode w1second = null;
    TreeNode w2first= null;
    TreeNode w2second = null;
    public void recoverTree(TreeNode root) {
        helper(root);
        if(wrong == 1){
            int temp = w1first.val;
            w1first.val = w1second.val;
            w1second.val = temp;
        }else{
            int temp = w1first.val;
            w1first.val = w2second.val;
            w2second.val = temp;
        }
    }

    void helper(TreeNode root){
        if(root == null){
            return;
        }
        helper(root.left);
        if(prev == null){
            prev = root;
        }else{
            if(root.val < prev.val){
                if(wrong == 0){
                    w1first = prev;
                    w1second = root;
                    wrong++;
                }else{
                    w2first = prev;
                    w2second = root;
                    wrong++;
                }
            }
            prev = root;
        }
        helper(root.right);
    }
}