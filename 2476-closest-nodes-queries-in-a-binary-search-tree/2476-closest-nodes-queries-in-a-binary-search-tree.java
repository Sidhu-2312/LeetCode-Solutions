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
    List<Integer> arr = new ArrayList<>();
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        inorder(root);
        List<List<Integer>> ans = new ArrayList<>();
     
        for(int query : queries){
            int floor = -1;
            int ceil = -1;
            int low = 0;
            int high=arr.size()-1;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(arr.get(mid)==query){
                    floor=arr.get(mid);
                    ceil = arr.get(mid);
                    break;
                }
               else if(arr.get(mid)<query){
                    floor=arr.get(mid);
                    low = mid +1;
                }
                else{
                    ceil = arr.get(mid);
                    high = mid -1;
                }
                
            }
         ans.add(Arrays.asList(floor,ceil));

        }
        return ans;
    }
    void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
}