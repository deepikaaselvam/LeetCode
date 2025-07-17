class Solution {
    public int evalRPN(String[] s) {
        Stack<Integer>stt = new Stack<>();
        for(int ind =0;ind<s.length;ind+=1)
        {
            // char ch = s.charAt(ind);
            if(s[ind].equals("+"))
            {
                if(!stt.isEmpty())
                {
                    int second = stt.pop();
                    int first = stt.pop();
                    int doManipulation = first+second;
                    stt.push(doManipulation);
                }
            }
            else if(s[ind].equals("-"))
            {
                 if(!stt.isEmpty())
                {
                    int second = stt.pop();
                    int first = stt.pop();
                    int doManipulation = first-second;
                    stt.push(doManipulation);
                }

            }
            else if(s[ind].equals("*"))
            {
                 if(!stt.isEmpty())
                {
                    int second = stt.pop();
                    int first = stt.pop();
                    int doManipulation = first*second;
                    stt.push(doManipulation);
                }

            }
            else if(s[ind].equals("/"))
            {
                 if(!stt.isEmpty())
                {
                    int second = stt.pop();
                    int first = stt.pop();
                    int doManipulation = first/second;
                    stt.push(doManipulation);
                }

            }
            else{
                int value = Integer.parseInt(s[ind]);
                stt.push(value);

            }
        }
        return stt.peek();
        
    }
}