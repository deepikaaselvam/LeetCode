class Solution {
    public String addSpaces(String s, int[] spaces) {
         StringBuilder  result=new StringBuilder();
        char[]c=s.toCharArray();
       
        int i=0,j=0;
        while(i<c.length )
        {
            if(j<spaces.length&& i==spaces[j])
            {
                result.append(" ");
                j++;
            }
            result.append(c[i]);
            i++;
        }
       
        return result.toString();
        
    }
}