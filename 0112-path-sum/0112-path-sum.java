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
    int sum =0;
    boolean res= false;

    public boolean hasPathSum(TreeNode node, int targetSum) {
        if(node == null)return false;

        
        // sum+= node.val;
        if(node.left == null && node.right == null && node.val == targetSum) return true;
        // if(node.left == null && node.right == null)sum-=node.val;

        // boolean lv = ;
        // boolean rv = ;

        // if(!lv || !rv)sum-=node.val;

        return hasPathSum(node.left, targetSum-node.val) || hasPathSum(node.right, targetSum-node.val);
    }

   
}