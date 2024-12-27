class Solution {
    public boolean isValid(String qns) {
         Stack<Character>st = new Stack<>();
        int i=0;
        char[]characterArray = qns.toCharArray();
        while(i<qns.length())
        {
            if(characterArray[i]=='(' || characterArray[i]=='[' || characterArray[i]=='{')
            {
                st.push(qns.charAt(i));
            }
            else 
            {
                if(st.isEmpty()) //means that..We found the Closing bracket without the opening Bracket ->return false into it
                {
                    return false;
                }
                char c=st.pop();
                if(( characterArray[i]==')'&&c!='(' )||(characterArray[i]==']'&& c!='[' )||(characterArray[i]=='}' &&c!='{'))
                {
                    return false;
                }

            }
            i++;
        }

        
        
        return st.isEmpty();
        
        
    }
}