class Solution {
    public int scoreOfString(String s) {
        char[]characterArray=s.toCharArray();
        int sum=0;
        for(int index=0;index<characterArray.length-1;index+=1)
        {
            int character1= characterArray[index]-'0';
            int character2= characterArray[index+1]-'0';
            sum+=Math.abs(character1-character2);
        }
        return sum;
        
    }
}