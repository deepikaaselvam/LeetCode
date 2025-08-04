class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        {
            return 0;
        }
        if(s.length()==1)
        {
            return 1;
        }
     HashMap<Character,Integer>mpp = new HashMap<>();
        int l =0;
        int r=0;
        int maximum =Integer.MIN_VALUE;
        while(r<s.length())
        {
            char ch = s.charAt(r);
            if(mpp.containsKey(ch)&& mpp.get(ch)>=l)
            {
                 l =mpp.get(ch);
                 l++;
               
            }
            mpp.put(ch,r);
             maximum =Math.max(maximum,(r-l+1));
             r+=1;
        }
      return maximum;

    }
}