class Solution {
    public String addSpaces(String s, int[] spaces) {
         StringBuilder  result=new StringBuilder();
        char[]c=s.toCharArray();
       
        int i=0,j=0;
        while(i<c.length && j<spaces.length)
        {
            if(i==spaces[j])
            {
                result.append(" ");
                result.append(c[i]);
                j++;
            }
            else
            {
                result.append(c[i]);
            }
            i++;
        }
        while(i<c.length)
        {
            result.append(c[i]);
            i++;
        }
        return result.toString();
        
    }
}