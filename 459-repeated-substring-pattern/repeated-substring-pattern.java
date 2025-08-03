class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int total =s.length();
        for(int ind =0;ind<s.length()-1;ind+=1)
        {
            String tempString = s.substring(0,ind+1);
            if(total%tempString.length() ==0)
            {
                int noOfRepeations = total/tempString.length();
                StringBuilder temporary = new StringBuilder();
                while(noOfRepeations>0)
                {
                    temporary.append(tempString);
                    noOfRepeations-=1;
                }
                if(temporary.toString().equals(s))
                {
                    return true;
                }
            }
        }
        return false;
        
        
    }
}