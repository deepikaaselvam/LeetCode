class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder answer = new StringBuilder();
        int maxLength =Math.max(word1.length(),word2.length());
        for(int index =0;index< maxLength ;index+=1)
        {
            if(index<word1.length())
                answer.append(word1.charAt(index));
            if(index<word2.length())
                answer.append(word2.charAt(index));
        }
        return answer.toString();
            // int Length1 = word1.length();
            // int Length2 = word2.length();
            // int total =Length1+Length2;
            // int cnt1 =0;
            // int cnt2=0;
            //  for(int index =0;index<(total);index+=1)
            // {
            //     if(cnt1==word1.length())
            //     {
            //         answer.append(word2.charAt(cnt2));
            //         cnt2+=1;
            //         // continue;
            //     }
            //     else if(cnt2==word2.length())
            //     {
            //         answer.append(word1.charAt(cnt1));
            //         cnt1+=1;
            //         // continue;
            //     }
            //     else if(index%2 ==0)
            //     {
            //         answer.append(word1.charAt(cnt1));
            //         cnt1+=1;
            //     }
            //     else{
            //         answer.append(word2.charAt(cnt2));
            //         cnt2+=1;

            //     }
            // }
            // return answer.toString();
        
    }
}