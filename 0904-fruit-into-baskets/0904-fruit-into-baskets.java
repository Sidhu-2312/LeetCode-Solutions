class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int max = 0;
        int fruit1=-1;
        int fruit2=-1;
        int count1=0;
        int count2=0;

        for(int right = 0;right<fruits.length;right++){
            int current = fruits[right];
            if(current==fruit1){
                count1++;
            }
            else if(current==fruit2){
                count2++;
            }else if(count1==0){
                fruit1=current;
                count1=1;
            }else if( count2==0){
                fruit2=current;
                count2=1;
            }else{
                while(count1>0 && count2>0){
                    if(fruits[left]==fruit1){
                        count1--;
                    }
                    else{
                        count2--;
                    }
                    left++;
                }
                if(count1==0){
                    fruit1=current;
                    count1=1;
                }
                else{
                    fruit2=current;
                    count2=1;
                }
            }
            max=Math.max(max,right-left+1);


        }
        return max;
    }
}