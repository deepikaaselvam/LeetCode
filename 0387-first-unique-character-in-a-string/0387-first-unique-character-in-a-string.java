class Solution {
    public int firstUniqChar(String s) {
      HashMap<Character,List<Integer>>mpp = new HashMap<>();
        char[]ch = s.toCharArray();
        for(int ind =0;ind<ch.length;ind+=1)
        {
            mpp.computeIfAbsent(ch[ind],x->new ArrayList<>()).add(ind);
        }
        int minValue = Integer.MAX_VALUE;
        
        for(Map.Entry<Character,List<Integer>>entries:mpp.entrySet())
        {
          List<Integer> index =entries.getValue(); 
            if(index.size()==1 && index.get(0)<minValue)
            {
                minValue=index.get(0);
            }
        }
        return minValue==Integer.MAX_VALUE?-1:minValue;
        
    }
}