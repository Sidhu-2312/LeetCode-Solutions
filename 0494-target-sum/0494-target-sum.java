class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return another(nums,0,0,target);
        
    }
    public int another(int[] nums,int index,int sum ,int target){
        if(index==nums.length){
            if(sum==target){
                return 1;
            }else{
                return 0;
            }
        }
        int a = another(nums,index + 1,sum+nums[index],target);
        int b= another(nums,index+1,sum-nums[index],target);
        return a + b;

    }
}