class Solution {
    public int maxScore(String s) {
        int RightString =0;
        int leftString=0;
        int maximum =0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                RightString++;
            }
        }
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='0')
            {
                leftString++;
            }
            else{
                RightString--;
            }
            maximum = Math.max(maximum,RightString+leftString);
        }
        return maximum;
        
    }
}