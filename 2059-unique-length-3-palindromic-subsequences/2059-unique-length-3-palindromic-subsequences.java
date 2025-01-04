class Solution {
    public int countPalindromicSubsequence(String s) {
        HashSet<Character>letters = new HashSet<>();
        for(char c : s.toCharArray())
        {
            letters.add(c);
        }
        int cnt=0;
        for(Character letter : letters)
        {
            int i=-1;
            int j=0;
            for(int k = 0;k < s.length();k++)
            {
                if(s.charAt(k)==letter)
                {
                    if(i==-1)
                    {
                        i=k;
                    }
                    j=k;
                    
                }
            }
            HashSet<Character>betweenLetters = new HashSet<>();
            for(int k=i+1 ;k<j ;k++)
            {
                betweenLetters.add(s.charAt(k));
            }
            cnt+=betweenLetters.size();
        }
        return cnt;

    }
}