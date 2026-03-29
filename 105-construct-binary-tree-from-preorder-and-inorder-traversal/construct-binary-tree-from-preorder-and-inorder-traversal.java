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
    HashMap<Integer, Integer> in = new HashMap<>();
    int idx = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i++){
            in.put(inorder[i], i);
        }
        return helper(preorder, 0, inorder.length - 1);
    }
    TreeNode helper(int[] preorder, int low, int high){
        TreeNode node = new TreeNode();
        if(low > high){
            return null;
        }
        node.val = preorder[idx];
        idx++;
        int id = in.get(node.val);
        node.left = helper(preorder, low, id - 1);
        node.right = helper(preorder, id + 1, high);
        return node;
    }
}