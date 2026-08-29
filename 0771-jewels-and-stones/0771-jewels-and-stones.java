class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] isjewel = new boolean[128];
        for(char ch : jewels.toCharArray()){
            isjewel[ch]=true;
        }
        int count = 0;
        for(char ch : stones.toCharArray()){
            if(isjewel[ch]){
                count++;
            }
        }
        return count;
    }
}