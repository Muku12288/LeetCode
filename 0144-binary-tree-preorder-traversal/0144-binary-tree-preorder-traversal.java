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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr  = new ArrayList<>();
        treeTraversal(root, arr);

        return arr;
    }

    public void treeTraversal(TreeNode node,List<Integer> arr){

        if(node == null){
            // arr.add(null);
            return;
        }
        arr.add(node.val);
        treeTraversal(node.left, arr);
        treeTraversal(node.right, arr);
    }
}