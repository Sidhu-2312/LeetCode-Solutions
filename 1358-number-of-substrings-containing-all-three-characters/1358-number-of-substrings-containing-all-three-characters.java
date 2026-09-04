class Solution {
    public int numberOfSubstrings(String s) {
        int left = 0;
        int ans = 0;
        int a = 0;
        int b = 0;
        int c=0;
        for(int right = 0;right<s.length();right++){
            if(s.charAt(right)=='a'){
                a++;

            }else if (s.charAt(right)=='b'){
                b++;
            }else{
                c++;
            }
            while(a>0 && b>0 && c>0){
                ans += s.length()-right;
                if(s.charAt(left)=='a'){
                    a--;

                }else if(s.charAt(left)=='b'){
                    b--;
                }else{
                    c--;
                }
                left++;
    
    }
}
return ans;
    }
}