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
    
//        List<Integer> subList=new HashList<Integer>();
//     public void path(TreeNode root, List<Integer> subList){
//         if(root.left==null && root.right==null) subList.add(root.val);
        
//         if(root.left!=null){
//             subList.add(root.left.val);
//             path(root.left, subList);
//         } 
//         if(root.right!+null){
//             subList.add(root.right.val);
//             path(root.right, subList);
//         }
//         return subList;
//     }
    public void findPath(TreeNode root, int sum, List<Integer> subList, List<List<Integer>> list){
        if(root==null) return ;
        subList.add(root.val);
        
        if(root.left==null && root.right==null && sum==root.val)
            list.add(subList);
        
        findPath(root.left, sum-root.val, new ArrayList<Integer>(subList), list);
        findPath(root.right, sum-root.val, new ArrayList<Integer>(subList), list);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        findPath(root, targetSum, new ArrayList<Integer>(), list);
        return list;
    }
}