class Solution {
    public boolean isCircularSentence(String sentence) {
        char[]characterArray=sentence.toCharArray();
        int i=0;
        char firstWord=characterArray[0];
        while(i<characterArray.length)
        {
            if(characterArray[i]==' ')
            {
                if(characterArray[i-1]!=characterArray[i+1])
                {
                    return false;
                }
                
            }
            if(characterArray[characterArray.length-1]!=firstWord)
            {
                return false;

            }
            i++;
        }
        return true;
        
    }
}