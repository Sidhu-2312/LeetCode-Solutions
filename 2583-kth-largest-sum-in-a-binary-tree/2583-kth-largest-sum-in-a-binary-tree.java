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
   // List<Integer> ans = new ArrayList<>();
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Long> ans = new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            long sum = 0;
            for(int i = 0;i< size;i++){
                TreeNode node = queue.poll();
                sum += node.val;
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            ans.add(sum);


        }
        Collections.sort(ans);
        if(ans.size()<k){
            return -1;
        }
        return ans.get(ans.size()-k);
    } 
    
}