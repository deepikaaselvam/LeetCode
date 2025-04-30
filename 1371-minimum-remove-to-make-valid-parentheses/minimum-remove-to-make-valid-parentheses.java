class Solution {
    public String minRemoveToMakeValid(String s) {
        char charArray[] = s.toCharArray();
        int count =0;
        for(int index =0;index<charArray.length;index+=1)
        {
            if(charArray[index]=='(')
            {
                count++;
            }
            else if(charArray[index]==')' && count>0)
            {
                count--;
            }
            else if(charArray[index]==')'&& count==0 )
            {
                charArray[index]='\0';
            }
        }
        count=0;
        for(int index=charArray.length-1;index>=0;index-=1)
        {
            if(charArray[index]==')')
            {
                count+=1;
            }
            else if(charArray[index]=='(' && count>0)
            {
                count-=1;
            }
            else if(charArray[index]=='('&& count==0 )
            {
                charArray[index]='\0';
            }
        }
        StringBuilder result = new StringBuilder();
        for(int index=0;index<charArray.length;index+=1)
        {
            if(charArray[index]!='\0')
            {
                result.append(charArray[index]);
            }
        }
        return result.toString();
        
    }
}