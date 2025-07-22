class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(int ind =0;ind<s.length();ind+=1)
        {
            if(s.charAt(ind)!='#')
            {
                s1.push(s.charAt(ind));
            }
            else{
                 if(!s1.isEmpty())
                s1.pop();
            }
        }
        for(int ind =0;ind<t.length();ind+=1)
        {
            if(t.charAt(ind)!='#')
            {
                s2.push(t.charAt(ind));
            }
            else
            {
                if(!s2.isEmpty())
                s2.pop();
            }
        }
        // int minimum = Math.min(s1.size(),s2.size());
        // for(int ind =0;ind<maximum ;ind+=1)
        // {

        // }
         if(s1.size()!=s2.size())
        {
            return false;
        }
        while(!s1.isEmpty() && !s2.isEmpty())
        {
            char ch1= s1.pop();
            char ch2 = s2.pop();
            if(ch1!=ch2)
            {
                return false;
            }
        }
        return true;
    }
}