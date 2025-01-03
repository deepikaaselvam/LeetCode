class Solution {
    public int waysToSplitArray(int[] array) {
         long[]prefixSum=new long[array.length];
        int cnt=0;
        prefixSum[0]=array[0];
        for(int i=1;i<array.length;i++)
        {
          
            prefixSum[i]=prefixSum[i-1]+array[i];
        }
        int l=0;
        while(l<array.length-1)
        {
            if(prefixSum[l]>=prefixSum[array.length-1]-prefixSum[l])
                {
                    cnt++;
                }
            l++;
        }
        return cnt;
        
    }
}