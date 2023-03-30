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
    int maxlevel=0;
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> list=new ArrayList<>();
        until(root,list,0);
        return list;
    }
    void until(TreeNode root, List<Integer> list, int level){
        if(root==null) return ;
        
        if(level==list.size())
             list.add(root.val);
        
//          list.set(level,root);
        
//         if(maxlevel<level){
//             list.add(root.val);
//             maxlevel=level;
//         }
        
        until(root.right,list,level+1);
        until(root.left,list,level+1);
    }
    
    
    // public List<Integer> until(Treenode root, ArrayList list, int level){
    //     ArrayList <Integer> list=new ArrayList<>();
    //     if(root==null) return list;
    //     list.add(root);
    //     until(root.left,list,level+1);
    //     until(root.right,list,level+1);
    //     return list;
    // }
    // public List<Integer> rightSideView(TreeNode root) {
    //     List<Integer> res=new LinkedList<>();
    //     res.add(until(root,res,0));
    //     return res;
    // }
    
}