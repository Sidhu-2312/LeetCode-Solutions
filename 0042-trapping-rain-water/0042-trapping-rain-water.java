class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int LeftMax=0;
        int RightMax=0;
        int water = 0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=LeftMax){
                  LeftMax=height[left];
                }else{
                    water += LeftMax - height[left];
                }
                left++;
            }
            else{
                if(height[right]>=RightMax){
                    RightMax =height[right];


                }else{
                    water += RightMax-height[right];
                }
                right--;
            }
        }
        return water;
        
    }
}