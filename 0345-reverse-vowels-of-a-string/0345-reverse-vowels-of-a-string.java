class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] arr = s.toCharArray();
        while(left<right){
            if(!isVowel(arr[left])){
                left++;
            }
           else if(!isVowel(arr[right-0])){
                right--;
            }
                else{
                   // char[] arr = s.toCharArray();
                char t=arr[left];
                arr[left]=arr[right];
                arr[right]=t;
                left++;
                right--;

            }
        }
        return new String(arr);

        
    }
    public boolean isVowel(char ch){
        if(ch=='a'||ch=='e'|| ch == 'i' || ch=='o'|| ch=='u'||ch=='A'|| ch == 'E'|| ch=='I'|| ch=='O' || ch =='U'){
            return true;
        }
        return false;
    }
}