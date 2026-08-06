class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max = 1;
        int count = 1;
        int majority = nums[0];
        for(int i = 1 ;i < nums.length;i++){
            if(nums[i-1]==nums[i]){
                count++;
            }else{
                count = 1;
                
                
            
            }
            if(count>max){
                max=count;
                majority=nums[i];
            }
            
        }
        return majority;
    }
}