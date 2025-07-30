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
    private static boolean pathSumCalc(TreeNode root, int targetSum,int original)
    {
       if(root==null)
        {
            return false;
        } 
       if(root.left==null && root.right==null)
       {
        int val = targetSum -root.val;
        if(val==0)
        {
            return true;
        }
        return false;
       } 
        
     
      
        targetSum =targetSum -root.val;
        return pathSumCalc(root.left,targetSum,original)||pathSumCalc(root.right,targetSum,original);

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
        {
            return false;
        }
        int original =targetSum;
        return pathSumCalc(root,targetSum,original);
        
       
    }
}