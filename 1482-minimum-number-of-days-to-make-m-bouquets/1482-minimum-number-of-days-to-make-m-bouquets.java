class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length){
            return -1;
        }
        int low =Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i : bloomDay){
            low=Math.min(low,i);
            high=Math.max(high,i);

        }
        int ans = high;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(countMakeBouquets(bloomDay,mid,m,k)){
                ans = mid;
                high = mid -1;
            }else{
                low = mid +1;
            }
            //return ans;
        }
               return ans;
        
    }
    public boolean countMakeBouquets(int[] bloomDay,int days,int m,int k){
        int bouquete = 0;
        int flowers=0;
        for(int i : bloomDay){
            if(i<=days){
                flowers++;
                if(flowers==k){
                    bouquete ++;
                    flowers=0;
                }
                }
                else{
                    flowers=0;
                }
            
        }
        return bouquete>=m;
    }
}