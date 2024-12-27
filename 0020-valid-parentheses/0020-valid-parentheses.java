class Solution {
    public boolean isValid(String s) {
        //  Stack<Character>st = new Stack<>();
        // int i=0;
        // char[]characterArray = qns.toCharArray();
        // while(i<qns.length())
        // {
        //     if(characterArray[i]=='(' || characterArray[i]=='[' || characterArray[i]=='{')
        //     {
        //         st.push(qns.charAt(i));
        //     }
        //     else 
        //     {
        //         if(st.isEmpty())
        //         {
        //             return false;
        //         }
        //         char c=st.pop();
        //         if(( characterArray[i]==')'&&c!='(' )||(characterArray[i]==']'&& c!='[' )||(characterArray[i]=='}' &&c!='{'))
        //         {
        //             return false;
        //         }

        //     }
        //     i++;
        // }

        // if(!st.isEmpty())
        // {
        //     return false;
        // }
        // return true;
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
            {
                st.push(s.charAt(i));
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                char c=st.pop();
                if((s.charAt(i)==')'&&c!='(')||
                (s.charAt(i)==']' && c!='[')||
                (s.charAt(i)=='}'&& c!='{'))
                {
                    return false;
                }
            }
        }
        if(st.isEmpty())
        {
            return true;
        }
        return false;
        
    }
}