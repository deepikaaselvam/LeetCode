class Solution {
    public String decodeString(String s) {
       int number =0;int value =0;
        String temporary ="";
        // StringBuilder result = new StringBuilder();
        Stack<Integer>numberStack = new Stack<>();
        Stack<String>letterStack= new Stack<>();
        StringBuilder temporaryStorage = new StringBuilder();
        for(int ind =0;ind<s.length();ind+=1)
        {
            char ch = s.charAt(ind);
            if(Character.isDigit(ch))
            {
                 number =number*10+(ch -'0');
            }
            else if(ch =='[')
            {
                numberStack.push(number);
                letterStack.push(temporaryStorage.toString());
                temporaryStorage.setLength(0);
                number =0;
            }
            else if(ch==']')
            {
                value = numberStack.pop();
                temporary= temporaryStorage.toString();
                // letterStack.push(temporaryStorage.toString());
                String prev = letterStack.pop();
                StringBuilder sb  = new StringBuilder(prev);
                for(int index=0;index<value;index+=1)
                {
                    sb.append(temporary);
                }
                // letterStack.push(result.toString());
                temporaryStorage = sb;
                number =0;



            }
            else{
                temporaryStorage.append(ch);
            }

        }
        return temporaryStorage.toString();
        
        
        
    }

}