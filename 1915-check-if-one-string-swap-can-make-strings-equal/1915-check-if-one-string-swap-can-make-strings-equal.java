class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
        {
            return true;
        }
        char[]freqMap1 =new char[26];
        char []freqMap2 =new char[26];
        int DiferCnt=0;

       for(int i=0;i<s1.length();i++)
       {

        char c1=s1.charAt(i);
        char c2= s2.charAt(i);
        if(c1!=c2)
        {
            DiferCnt++;
            if(DiferCnt>2) return false;
        }
        

        freqMap1[c1-'a']++;
       freqMap2[c2-'a']++;
       }

       return Arrays.equals(freqMap1,freqMap2);


        
    }
}