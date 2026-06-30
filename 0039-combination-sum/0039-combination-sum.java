class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

         List<List<Integer>> ans = new ArrayList<>();
          helper(0,target,candidates, new ArrayList<>(),ans);
         return ans;
    }
        public void helper(int index,int target,int[] candidates,List<Integer> temp, List<List<Integer>> ans ){
         if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
         }
         if(target<0 || index==candidates.length){
            return;
         }
         temp.add(candidates[index]);
         helper(index,target-candidates[index],candidates,temp,ans);
         temp.remove(temp.size()-1);

         helper(index + 1,target,candidates,temp,ans);


    }
}