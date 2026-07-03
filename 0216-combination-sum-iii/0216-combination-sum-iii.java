class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        solu(1,k,n,ans,new ArrayList<>());
        return ans;
        
    }
    public void solu(int start,int k ,int n , List<List<Integer>> ans ,List<Integer> temp){
        if(n==0 && k == 0){
            ans.add(new ArrayList<>(temp));
            return;


        }
        if(n <= 0 || k ==0){
            return ;
        }
        for(int i = start; i<=9;i++){
            temp.add(i);
            solu(i+1,k-1,n-i,ans,temp);
            temp.remove(temp.size()-1);
        }
    }
}