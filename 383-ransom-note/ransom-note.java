class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>mpp1 = new HashMap<>();
        HashMap<Character,Integer>mpp2 = new HashMap<>();
        for(int ind =0;ind<magazine.length();ind+=1)
        {
            char ch1= magazine.charAt(ind);
            mpp1.put(ch1,mpp1.getOrDefault(ch1,0)+1);
        }
        System.out.println(mpp1);
        for(int ind =0;ind<ransomNote.length();ind+=1)
        {
            char ch2 = ransomNote.charAt(ind);
            if(!mpp1.containsKey(ch2)|| mpp1.get(ch2)<=0)
            {
                return false;
            }
            else if(mpp1.containsKey(ch2))
            {
                int val = mpp1.get(ch2);
                mpp1.put(ch2,val-1);
            }
            mpp2.put(ch2,mpp2.getOrDefault(ch2,0)+1);
        }
          System.out.println(mpp2);
        // for(int ind=0;ind<ransomNote.length();ind+=1)
        // {
        //     char ch = ransomNote.charAt(ind);
        //     if(mpp2.containsKey(ch))
        //     {
        //         int value=mpp2.get(ch);
        //         if(value>0)
        //         {
        //             mpp2.put(ch,value-1);
        //         }
        //         else
        //         {
        //             return false;
        //         }
                
        //     }
        //     else
        //     {
        //         return false;
        //     }
        // }
        return true;
        
    }
}