class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String>result = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(i!=j && words[j].contains(words[i]))
                {
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
        // public static String[] sort(String []s)
        // {
        //     for (int i=1 ;i<s.length; i++)
        //     {
        //         String temp = s[i];
        
        //         // Insert s[j] at its correct position
        //         int j = i - 1;
        //         while (j >= 0 && temp.length() < s[j].length())
        //         {
        //             s[j+1] = s[j];
        //             j--;
        //         }
        //         s[j+1] = temp;
        //     }
        // }
        // String[]ans = sort(words);
        // String newString[] =new String[ans.length()];
        // ƒor(int i=0;i<ans.length;i++)
        // {
        //     newString[i]=ans[i];
        // }
        // for(int i=0;i<newString.length-1;i++)
        // {
        //     String currentWord=newString[i];
        //     for(int j=i+1;j<newString.length;j++)
        //     {
        //         if()
        //     }

        // }
       
        
    }
}