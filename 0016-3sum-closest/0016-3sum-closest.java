class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int bestsum=nums[0]+nums[1]+nums[2];
        
        //int a = nums[0];
        //while(left<right){
        for(int i = 0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
             while(left<right){
            int sum = nums[i] + nums[left]+nums[right];
            
                if(Math.abs(sum-target)<Math.abs(bestsum-target)){
                    bestsum = sum;
                
                }
                if(sum<target){
                    left++;

                }
                else if(sum>target){
                    right--;
                }
                else{
                    return sum;
                }
            }
             }
            return bestsum;
    }
}