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
    public void path(TreeNode root, String path, List<String> list){
        if(root.left==null && root.right==null) list.add(path+root.val);
        if(root.left != null) path(root.left,path+root.val+"->",list);
        if(root.right != null) path(root.right,path+root.val+"->",list);
    }
    public List<String> binaryTreePaths(TreeNode root) {
         List<String> list=new ArrayList<String>();
         if(root != null) path(root,"",list);
        
        return list;
    }
}