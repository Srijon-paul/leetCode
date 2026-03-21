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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean lr = false;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> tmp = new ArrayList<>();
            while (levelSize > 0) {
                TreeNode t = queue.peek();
                queue.poll();
                if (lr) {
                    tmp.addFirst(t.val);
                } else {
                    tmp.add(t.val);
                }
                if(t.left != null){
                    queue.add(t.left);
                }
                if(t.right != null){
                    queue.add(t.right);
                }
                levelSize--;
            }
            lr = !lr;
            res.add(tmp);
        }
        return res;
    }
}