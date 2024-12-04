class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        if(str2.length()>str1.length())
        {
            return false;
        }
        char[]c1=str1.toCharArray();
        char[]c2=str2.toCharArray();
        int i=0,j=0;
        while(i<c1.length&& j<c2.length)
        {
            if(c1[i]==c2[j] || c1[i]+1==c2[j]||(c1[i]=='z'&& c2[j]=='a'))
            {
                i++;
                j++;
            }
            else
            {
                i++;
            }
        }
        return j==c2.length;
        
    }
}