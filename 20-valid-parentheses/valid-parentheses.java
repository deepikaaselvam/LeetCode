class Solution {
    public boolean isValid(String s) {
        if(s.length()==1)
        {
            return false;
        }
       Stack<Character>st = new Stack<>();
        for(int ind =0;ind<s.length();ind+=1)
        {
            char ch = s.charAt(ind);
            if(ch=='(') st.push(ch);
            else if(ch=='[') st.push(ch);
            else if(ch=='{')st.push(ch);
            else if(ch==')')
            {
                if(!st.isEmpty() && st.peek()=='(')
                {
                    st.pop();    
                }
                else{
                    return false;
                }     
            }
            else if(ch==']')
            {
                if(!st.isEmpty() && st.peek()=='[')
                {
                    st.pop();
                }
                else{
                    // st.push(ch);
                    return false;
                 }
                
            }
            else if(ch=='}')
            {
                 if(!st.isEmpty() && st.peek()=='{')
                {
                    st.pop();
                    
                }
                else {return false;}
               
            }
           
        }
        return st.isEmpty();
        
    }
}







 // if(ch=='(') open++;
            // else if(ch==')') open--;
            // else if(ch=='[') square++;
            // else if(ch==']') square--;
            // else if(ch=='{') curly++;
            // else curly--;