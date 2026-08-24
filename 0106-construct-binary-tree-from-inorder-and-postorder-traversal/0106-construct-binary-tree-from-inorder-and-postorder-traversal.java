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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return sol(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
        
        
    }
    public TreeNode  sol(int[] inorder, int[] postorder,int instart,int inend,int poststart,int postend){
        if(instart>inend || poststart>postend){
            return null;
        }
        int rootvalue=postorder[postend];
        TreeNode root= new TreeNode(rootvalue);
        int rootindex=instart;
        while(inorder[rootindex]!=root.val){
            rootindex++;

        }
        int leftsize=rootindex-instart;
        root.left=sol(inorder,postorder,instart,rootindex-1,poststart,poststart+leftsize-1);
        root.right=sol(inorder,postorder,rootindex+1,inend,poststart+leftsize,postend-1);
        return root;
    }
}