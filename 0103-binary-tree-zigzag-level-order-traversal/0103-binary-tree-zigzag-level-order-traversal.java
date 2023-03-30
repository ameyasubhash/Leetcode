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
       
        Queue<TreeNode> q= new LinkedList<>();
        List<List<Integer>> list=new LinkedList<List<Integer>>();
        
        if(root==null) return list;
        q.offer(root);
         boolean flag=false;
        
        while(!q.isEmpty()){
            int level=q.size();
            LinkedList<Integer> subList=new LinkedList<Integer>();
            
            for(int i=0;i<level;i++){ 
                
                TreeNode cur=q.poll();
                
                if(cur.left!=null)
                q.offer(cur.left);
                
                if(cur.right!=null)
                q.offer(cur.right); 
                
                if(flag)
                    subList.addFirst(cur.val);
                else
                    subList.add(cur.val);
            // if(flag%2!=0){
            //     if(q.peek().left!=null)
            //     q.offer(q.peek().left);
            //     if(q.peek().right!=null)
            //     q.offer(q.peek().right);  
            // }
            // else{
            //     if(q.peek().right!=null)
            //     q.offer(q.peek().right);
            //     if(q.peek().left!=null)
            //     q.offer(q.peek().left);
            // }
            // flag++;   
          // subList.add(q.poll().val);
            }
            
            list.add(subList);
            flag=!flag;
        }
        return list;
    }
}