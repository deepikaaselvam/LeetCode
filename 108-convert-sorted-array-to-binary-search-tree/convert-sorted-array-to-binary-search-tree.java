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
    private static TreeNode binarySearchTree_helper(int[]nums,int left,int right)
    {
        if(left>right)
        {
            return null;
        }

        int mid = (left+right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = binarySearchTree_helper(nums,left,mid-1);
        root.right = binarySearchTree_helper(nums,mid+1,right);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return binarySearchTree_helper(nums,0,nums.length-1);
       


        
    }
}