class Solution {
    public String toLowerCase(String s) {
        char[]ch=s.toCharArray();
        String ans="";
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='A' && ch[i]<='Z')
            {
                ans+=(char)(ch[i]+32);
            }
            else
            {
                ans+=ch[i];
            }

        }
        
        return ans;
    }
}