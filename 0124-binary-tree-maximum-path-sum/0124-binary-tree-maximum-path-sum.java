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
    int maxi=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        // maxi = root.val;
        maxsum(root);
        
        return maxi;
    }
    public int maxsum(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = maxsum(node.left);
        int right = maxsum(node.right);
        if(left <0)left=0;
        if(right<0)right=0;

        maxi = Math.max(maxi, (node.val+left+right));

        return node.val+Math.max(left, right);
    }
}