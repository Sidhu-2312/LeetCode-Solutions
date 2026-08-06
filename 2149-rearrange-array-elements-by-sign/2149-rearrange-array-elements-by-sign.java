class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
      //  int index = 0;
        int[] ans1=new int[n/2];
        int[] ans2=new int[n/2];
        int p = 0;
        int neg = 0;
        for(int i = 0 ;i < n;i++){
            if(nums[i]>0){
                ans1[p++]=nums[i];
            }else{
                ans2[neg++]=nums[i];
            }
        }
        int[] result = new int[n];
        p=0;
        neg=0;
        for(int i = 0;i<n;i+=2){
            result[i]=ans1[p++];
         result[i+1]=ans2[neg++];
        }

        return result;

    }
}