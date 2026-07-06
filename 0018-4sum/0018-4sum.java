class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        //int i = nums[0];
       // int j = nums[1];
        for(int l= 0;l<nums.length-3;l++){
            if(l>0 && nums[l]==nums[l-1]){
                continue;

            }
            for(int a = l+1;a<nums.length-2;a++){
                if(a>l+1 && nums[a]==nums[a-1]){
                    continue;
                }
                int left = a+1;
                int right = nums.length-1;
                while(left<right){
                    long sum = (long) nums[l]+nums[a]+nums[left]+nums[right];
                    if(sum==target){
                ans.add(Arrays.asList(nums[l],nums[a],nums[left],nums[right]));
                left++;
                right--;
                while(left < right && nums[left] == nums[left-1])
    left++;

while(left < right && nums[right] == nums[right+1])
    right--;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
       // return ans;
        
    }
      return ans;
}
}