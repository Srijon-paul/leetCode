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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter - 1;
    }
    private int height(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftnode = height(node.left);
        int rightnode = height(node.right);
        int dia = leftnode + rightnode + 1;
        diameter = Math.max(diameter, dia);

        return Math.max(leftnode, rightnode) + 1;
    }
}