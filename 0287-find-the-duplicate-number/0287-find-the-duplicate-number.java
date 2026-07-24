class Solution {
    public int findDuplicate(int[] nums) {
    //     int i =0;
    //     while(i<arr.length){
    //         if (arr[i] != i + 1) {
    //             int correct  = arr[i] - 1;
    //             if(arr[i]!=arr[correct]){
    //                 swap(arr,i,correct);
    //             }else {
    //                 return arr[i];
    //             }
    //         }else{
    //             i++;
    //         }
    //     }
    //     return -1;

    // }
    // static void swap(int[] arr,int start,int end){
    //     int temp =arr[start];
    //     arr[start]=arr[end];
    //     arr[end]=temp;
    // }
       int fast = nums[0];
       int slow= nums[0];
       do{
        slow=nums[slow];
        fast=nums[nums[fast]];
       }while(slow!=fast);
       int ptr = nums[0];
       while(ptr!=slow){
        ptr=nums[ptr];
        slow=nums[slow];
       }
       return ptr;
    }
}