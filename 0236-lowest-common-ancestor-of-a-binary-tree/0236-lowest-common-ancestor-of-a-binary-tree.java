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
    public boolean getPath(TreeNode node, List<TreeNode> arr ,int x){
        if(node == null){
            return false;
        }
        arr.add(node);
        if(node.val == x){
            return true;
        }

        if(getPath(node.left, arr , x) || getPath(node.right, arr , x)){
            return true;
        }
        arr.remove(arr.size()-1);
        return false;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> arr1 = new ArrayList<>();
        List<TreeNode> arr2 = new ArrayList<>();

        getPath(root, arr1 , p.val);
        getPath(root, arr2 , q.val);
        // System.out.println(arr);

        int n = Math.min(arr1.size(),arr2.size());
        for(int i=0; i<n; i++){
            if(i==n-1 && (arr1.get(i).val == arr2.get(i).val)){
                return arr1.get(i);
            }
            else if(arr1.get(i).val != arr2.get(i).val){
                return arr1.get(i-1);
            }
        }
        return root;
    }
}