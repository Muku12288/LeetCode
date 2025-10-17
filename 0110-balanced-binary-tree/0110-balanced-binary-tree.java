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
    public boolean isBalanced(TreeNode node) {
        if(node == null)return true;

        int lh = findLeftHeight(node.left);
        int rh = findLeftHeight(node.right);

        if(Math.abs(rh - lh) > 1)return false;

        boolean left = isBalanced(node.left);
        boolean right = isBalanced(node.right);

        if(!left || !right)return false;

        return true;
    }

    public int findLeftHeight(TreeNode node){
        if(node == null){
            return 0;
        }

        int lt = findLeftHeight(node.left);
        int rt = findLeftHeight(node.right);

        return 1+Math.max(lt, rt);
    }
}