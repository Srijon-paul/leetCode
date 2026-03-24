/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val > q.val){
            helper(root, q, p);
        }else{
            helper(root, p, q);
        }
        return ans;
    }
    void helper(TreeNode node, TreeNode p, TreeNode q){
        if(node == null){
            return;
        }
        if(node == p || node == q){
            ans = node;
            return;
        }
        if(node.val > q.val){
            helper(node.left, p , q);
        }else if(node.val < p.val){
            helper(node.right, p , q);
        }else{
            ans = node;
            return;
        }
    }
}