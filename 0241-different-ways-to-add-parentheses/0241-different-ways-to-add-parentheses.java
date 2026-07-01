class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
          List<Integer> list = new ArrayList<>();
        if (!expression.contains("+") &&
            !expression.contains("-") &&
            !expression.contains("*")) {

            list.add(Integer.parseInt(expression));
            return list;
        }

        for(int i = 0;i<expression.length();i++){
            char op = expression.charAt(i);
            if(op== '+' || op=='-' || op=='*' ){
                String left=expression.substring(0,i);
                String right=expression.substring(i+1);
               
              List<Integer>  leftside=diffWaysToCompute(left);
               List<Integer>  rightside=diffWaysToCompute(right);

               for(int l:leftside){
                for(int r: rightside){
                   int result = 0;
                   if(op=='+'){
                    list.add(l + r);
                
                   }

                   else if (op=='-'){
                    list.add(l- r);
                
                   }


                   else if (op=='*'){
                    list.add(l * r);
                
                   }

                 //  list.add(result);

                }
               }

            }
        }
        return list;
    }
}