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
    int maxsum = 0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return maxsum;
        
    }
    public int dfs(TreeNode root){
        if(root==null){
            return 0 ;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        if(root.left!=null && root.left.val == root.val){
            left++;
        }else{
            left=0;
        }
        if(root.right!=null && root.right.val==root.val){
            right++;

        }else{
            right=0;
        }
        maxsum=Math.max(maxsum,left+right);
        return Math.max(left,right);
    }
}