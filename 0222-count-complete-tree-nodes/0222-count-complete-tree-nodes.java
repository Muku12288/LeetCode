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
    public int countNodes(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        dfs(root, arr);

        return arr.size();
    }

    void dfs(TreeNode node, List<Integer> arr){
        if(node == null){
            return;
        }

        dfs(node.left, arr);
        dfs(node.right, arr);
        arr.add(node.val);
    }
}