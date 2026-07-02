class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        // if(n==0){
        //     return new ArrayList<>();
        // }
         sol("",n,n,ans);
         return ans;

        
    }
    public void sol(String path,int open,int close,List<String> ans){
        if(open==0 && close==0){
            ans.add(path);
            return ;
        }
        if(open>0){
            sol(path+"(",open-1,close,ans);
        }if(close>open){
        sol(path + ")",open,close-1,ans);
        }
    }
}