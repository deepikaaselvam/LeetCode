class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        for(int ind =0;ind<s.length();ind++){
            char ch = s.charAt(ind);
            if(ch!='*'&& ch!='#'&& ch!='%'){
                result.append(ch);
            }
            else if(ch=='*'){
                if(result.length() > 0){
                    result.deleteCharAt(result.length()-1);
                }
            }else if(ch=='#'){
                result.append(result);
            }else if(ch == '%'){
                result.reverse();
            }
        }
        return result.toString();
        
    }
}