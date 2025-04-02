class Solution {
    public char findTheDifference(String s, String t) {
        for(int index =0;index<s.length();index+=1)
        {
            if(s.charAt(index)!=t.charAt(index))
            {
                return t.charAt(index);
            }
        }
        return t.charAt(t.length()-1);
       
        
    }
}
/* int maximumLength =Math.max(s.length(),t.length());
        int[]check = new int[26];
        int flag =0;
        int index1 =0;
        int index2=0;
        for(int index =0;index<maximumLength;index+=1)
        {
            if(index1<s.length())
            {
                check[s.charAt(index1)-'a']++;
                index1+=1;
            }
            if(index2<t.length())
            {
                check[t.charAt(index2)-'a']--;
                index2+=1;
            }
           
     
        }
        for(int answer =0;answer<check.length;answer+=1)
        {
            if(check[answer]!=0)
            {
                flag =answer;
                break;
            }
        }
        return ((char)(flag));*/