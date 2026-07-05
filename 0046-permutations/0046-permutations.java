class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited =new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        solution(nums,visited,ans,new ArrayList<>());
        return ans;
        
        
    }
    public void solution(int[] nums,boolean[] visited,List<List<Integer>> ans,List<Integer> temp){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;

        }
        for(int i = 0; i< nums.length;i++){
            if(visited[i]){
                continue;
            }
            visited[i]=true;
            temp.add(nums[i]);
           // int[] remaining= nums.remove(nums[i]);
            solution(nums,visited,ans,temp);
            temp.remove(temp.size()-1);
            visited[i]=false;
        }
    }
}