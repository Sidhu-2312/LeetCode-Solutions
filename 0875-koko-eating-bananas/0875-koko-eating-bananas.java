class Solution {
    private long countHours(int[] piles, int speed) {
        long totalH=0;
        for(int i : piles){
            totalH += (i + speed -1)/speed;
        }
        return totalH;
        
    }
    public int minEatingSpeed(int[] piles,int h){
        int maxPiles = Arrays.stream(piles).max().getAsInt();
        int low = 1;
        int high = maxPiles;
        int ans=maxPiles;
        while(low<=high){
            int mid = low + (high - low)/2;
            long totalH=countHours(piles,mid);
            if(totalH<=h){
                ans = mid;
                high = mid - 1;
            } 
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}