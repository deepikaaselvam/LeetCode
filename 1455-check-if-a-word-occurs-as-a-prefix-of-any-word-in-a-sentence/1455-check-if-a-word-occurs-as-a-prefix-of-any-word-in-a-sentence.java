class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
         int matchIndex=1;
            char[]c1=sentence.toCharArray();
            char[]c2=searchWord.toCharArray();
            int i=0,j=0;
        while (i < c1.length) 
        {
            
            if ((i == 0 || c1[i - 1] == ' ') && c1[i] == c2[j]) 
            {
                j++;
                int tempI = i + 1; 
                while (j < c2.length && tempI < c1.length && c1[tempI] == c2[j]) 
                {
                    tempI++;
                    j++;
                }

                if (j == c2.length) 
                {
                    return matchIndex;
                }
                j = 0; 
            }

            if (c1[i] == ' ') 
            {
                matchIndex++; 
            }
            i++;
        }
     return -1;
}
}