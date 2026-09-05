class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);

    }
    public int atmost(int[] nums,int k){

    
        int left = 0;
       // int right = 0;
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right = 0;right<nums.length;right++){
            int rightNum = nums[right];
             map.put(rightNum, map.getOrDefault(rightNum, 0) + 1);
             while(map.size()>k){
                int leftNum = nums[left];
                map.put(leftNum,map.get(leftNum)-1);
                if(map.get(leftNum)==0){
                    map.remove(leftNum);
                }
                left++;
             }
             
            count += right-left+1;
        }
        return count;
        
    }
}
