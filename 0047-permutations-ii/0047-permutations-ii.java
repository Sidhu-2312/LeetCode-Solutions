class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        solution(nums,visited,ans,new ArrayList<>());
        return ans;
        
    }
    public void solution(int[] nums,boolean[] visited,List<List<Integer>> ans,List<Integer> temp){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp) );
            return;
        }
        for(int i = 0 ;i < nums.length ; i++){
            if(visited[i]){
                      continue;
            }
        if(i>0 && nums[i]==nums[i-1] && !visited[i-1]){
            // LOGIC FOR DUPLICATION IS TO..FIRST USE THE 1ST ELEMENT THEN USE THE 2ND ONE...U SHOULD NOT USE THE 2ND ELEMENT BEFORE USEING THE 1ST ELEMENT..BECAUSE IN PERMUTATAION WE NEED ALL THE ELEMENTS

            continue;
        }
        visited[i]=true;
        temp.add(nums[i]);
        solution(nums,visited,ans,temp);
        temp.remove(temp.size()-1);
        visited[i]=false;
    }
    }
}