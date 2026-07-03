class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        sol(0,arr,new ArrayList<>(),ans);
        return ans;
        // Arrays.sort(arr);
        // List<List<Integer>> outer = new ArrayList<>();
        // outer.add(new ArrayList<>());
        // for(int num : arr){
        // int n = outer.size();
        // for(int i = 0;i<n;i++){
        //     List<Integer> internal = new ArrayList<>(outer.get(i));
        //     internal.add(num);
        //       if(!outer.contains(internal)){
        //         outer.add(internal);
        //       }
        // }
        // }
        // return outer;
    }
    public void sol(int index,int[] arr,List<Integer> temp,List<List<Integer>> ans ){
        ans .add ( new ArrayList<>(temp));
        for(int i = index; i<arr.length;i++ ){
            if(i> index && arr[i]==arr[i-1]){
                continue;
            }
            temp.add(arr[i]);
            sol(i+1,arr,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}