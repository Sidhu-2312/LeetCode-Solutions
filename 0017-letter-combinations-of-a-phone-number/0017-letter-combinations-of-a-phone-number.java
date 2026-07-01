class Solution {
     public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        return pad("", digits);
    }

    // private ArrayList<String> helper(String p,String digits) {
    //     if(digits.isEmpty()){
    //         ArrayList<String> list=new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }
    //      String[] map = {
    //         "", "", "abc", "def", "ghi",
    //         "jkl", "mno", "pqrs", "tuv", "wxyz"
    //     };
    //    //  String letters = map[digit];
    //     int digit=digits.charAt(0)-'0';
    //      String letters = map[digit];
    //     ArrayList<String> list = new ArrayList<>();
    //      for (int i = 0; i < letters.length(); i++) {
    //         char ch = letters.charAt(i);
    //         list.addAll(helper(p+ch,digits.substring(1)));

    //     }
    //     return list;
        
    



    //    public ArrayList<String> pad(String p,String digits){
    //     if(digits.isEmpty()){
    //         ArrayList<String> list = new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }
    //     ArrayList<String> list = new ArrayList<>();
       
    //    int dight = digits.charAt(0)-'0';
    //    for(int i = (digit-2)*3;i<(digit-1)*3;i++){
    //     char ch = (char)('a'+ i);
    //     list.addAll(pad(p+ch,digits.substring(1)));
    //           // return list;
    //    }
    //     return list;
    //    }
         

         public ArrayList<String> pad(String p, String digits) {
    if (digits.isEmpty()) {
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
    }

    ArrayList<String> list = new ArrayList<>();

    int digit = digits.charAt(0) - '0';

    int start, end;

    if (digit >= 2 && digit <= 6) {
        start = (digit - 2) * 3;
        end = start + 3;
    } else if (digit == 7) {
        start = 15;
        end = 19;
    } else if (digit == 8) {
        start = 19;
        end = 22;
    } else { // digit == 9
        start = 22;
        end = 26;
    }

    for (int i = start; i < end; i++) {
        char ch = (char) ('a' + i);
        list.addAll(pad(p + ch, digits.substring(1)));
    }

    return list;
}
}