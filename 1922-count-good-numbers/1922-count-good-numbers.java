class Solution {
    long mod = 1000000007;
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd= n/2;
        long a = power(5,even);
        long b = power(4,odd);
        return (int)((a*b)%mod);
        
    }
    public long power(long base,long exp){
        if(exp==0){
            return 1;
        }
        long half = power(base,exp/2);
            long ans = (half * half) % mod;

        if(exp%2==0){
            return ans;
        }
        return(ans*base)% mod;
    }
}