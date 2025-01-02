class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        ArrayList<Integer>prefixSum=new ArrayList<>();
        ArrayList<Integer>result = new ArrayList<>();
        int sum=0;
        for(int i=0;i<words.length;i++)
        {
            String str=words[i];
            if((str.charAt(0)=='a'||str.charAt(0)=='e'||str.charAt(0)=='i'||str.charAt(0)=='o'||str.charAt(0)=='u')&&(str.charAt(str.length()-1)=='a'||str.charAt(str.length()-1)=='e'||str.charAt(str.length()-1)=='i'||str.charAt(str.length()-1)=='o'||str.charAt(str.length()-1)=='u'))
            {
                sum+=1;
            }
            prefixSum.add(sum);
        }
        for(int[] querie:queries)
        {
            int l = querie[0];
            int r = querie[1];
            int cnt = prefixSum.get(r)-(l>0?prefixSum.get(l-1):0);
            result.add(cnt);
        }
        int[]answer=new int[result.size()];
        for(int i=0;i<answer.length;i++)
        {
            answer[i]=result.get(i);
        }
        return answer;
        
        
    }
}