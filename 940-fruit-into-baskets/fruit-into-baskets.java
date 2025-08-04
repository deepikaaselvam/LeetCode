class Solution {
    public int totalFruit(int[] basket) {
         HashMap<Integer,Integer>mpp = new HashMap<>();
        int l=0,r=0;
        int maxlen = 0;
        while(r<basket.length&& l<basket.length)
        {
            mpp.put(basket[r],mpp.getOrDefault(basket[r],0)+1);
            if(mpp.size()<=2)
            {
                maxlen =Math.max(maxlen,(r-l+1));
            }
            else{
               
                while(mpp.size()>2)
                {
                    int value = mpp.get(basket[l]);
                    mpp.put(basket[l],value-1);
                       if(mpp.get(basket[l])==0)
                        {
                            mpp.remove(basket[l]);
                        }
                    l++;
                }   

            }
            r++;
        }
        return maxlen;
        
    }
}