class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int MaxArea=0;
        while(left<right){
            int area = Math.min(height[left],height[right]) * (right-left);
           //  if(height[left]==height[right]){
            //      int area = Math.min(height[left],height[right]) * (right-left);
            //     left++;
              //   right--;
           //  }
            MaxArea=Math.max(MaxArea,area);
            if(height[left]<height[right]){
               // left++;
               // int area = Math.min(height[left],height[right]) * (right-left);
                left++;
            }
            else{
               // int area = Math.min(height[left],height[right]) * (right-left);
                right--;;
            }

        }
        return MaxArea ;
        
    }
}