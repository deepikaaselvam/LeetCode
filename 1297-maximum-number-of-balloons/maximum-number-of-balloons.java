class Solution {
    public int maxNumberOfBalloons(String text) {
        int bCount = 0, aCount = 0,lCount = 0, oCount = 0, nCount =0;
        for(char ch: text.toCharArray()){
            if(ch == 'b') bCount++;
            else if(ch == 'a') aCount++;
            else if(ch == 'l') lCount++;
            else if(ch == 'o') oCount++;
            else if(ch == 'n') nCount++;
            
        }
        return Math.min(Math.min(bCount, aCount),
                Math.min(Math.min(lCount/2, oCount/2), nCount)); 
    }
}