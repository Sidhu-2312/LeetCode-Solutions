class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            char leftchar=s.charAt(left);
            if(!Character.isLetterOrDigit(leftchar)){
                left++;
                continue;
            }
            char rightchar=s.charAt(right);
            if(!Character.isLetterOrDigit(rightchar)){
                right--;
                continue;
            }
            char leftLower = Character.toLowerCase(leftchar);
            char rightLower = Character.toLowerCase(rightchar);
            if(leftLower!=rightLower){
                return false;
            }
            else{
                left++;
                right--;
            }
           
        }
        return true;
        
    }
}