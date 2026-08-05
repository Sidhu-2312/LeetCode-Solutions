class Solution {
    public void rotate(int[] nums, int k) {
        //int[] ans = new int[];
    //     int n = nums.length;
    //      k = k % n;
    //      int[] ans = new int[n];
    //     int index= 0;
    //     for(int i = n-k ; i < n;i++){
    //     ans[index]=nums[i];
    //     index++;
    //     }
    //    for(int i = 0 ; i < n-k ; i++){
    //     ans[index]=nums[i];
    //     index++;
    //    }
    //    for(int i = 0;i<n;i++){
    //     nums[i]=ans[i];
    //    }
    int n = nums.length;
    k = k%n;
    reverse(nums,0,n-1);
    reverse(nums,0,k-1);
    reverse(nums,k,n-1);
    }
    public void reverse(int[] nums, int left,int right){
        while(left<right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}