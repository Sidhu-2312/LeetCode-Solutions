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
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        int count = countPaths(root,targetSum,0);
        count+=pathSum(root.left,targetSum);
        count+=pathSum(root.right,targetSum);
        return count;
        
    }
    public int countPaths(TreeNode node,int targetSum,long sum){
        if(node==null){
            return 0;
        }
        sum += node.val;
        int count = 0;
        if(sum==targetSum){
            count++;
        }
        count += countPaths(node.left,targetSum,sum);
        count += countPaths(node.right,targetSum,sum);
        return count;
    }
}