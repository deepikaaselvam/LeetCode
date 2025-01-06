class Solution {
    public int[] minOperations(String boxes) {
        int answer[]= new int[boxes.length()];
        char[]CharacterArray = boxes.toCharArray();
        for(int i=0;i<CharacterArray.length;i++)
        {
            for(int j=0;j<CharacterArray.length;j++)
            {
                if(CharacterArray[j]=='1')
                {
                    answer[i]+=Math.abs(i-j);
                }
            }
        }
        return answer;
        
    }
}