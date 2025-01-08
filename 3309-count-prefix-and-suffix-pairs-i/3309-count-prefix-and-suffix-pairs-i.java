class Solution {
    public int countPrefixSuffixPairs(String[] words) {
       
        int cnt=0;
        for(int i=0;i<words.length-1;i++)
        {
            for(int j = i+1;j<words.length;j++)
            {
                if(isPrefixandSuffix(words[i],words[j]))
                {
                    cnt++;
                }
            }
        }
        return cnt;
        
    }
     public static boolean isPrefixandSuffix(String prefix,String suffix)
    {
        if(suffix.startsWith(prefix) && suffix.endsWith(prefix))
        {
            return true;
        }
        return false;
    }
}