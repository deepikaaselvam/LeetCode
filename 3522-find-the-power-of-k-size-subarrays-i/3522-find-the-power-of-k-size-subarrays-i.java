class Solution {
    public int[] resultsArray(int[] array, int k) {
        int result[]=new int[array.length-k+1];
        if(array.length==1)
        {
            return new int[]{array[0]};
        }
        if(k==1)
        {
            return array;
        }
        for(int i=0;i<=array.length-k;i++)
        {
          
            int maxi=array[i];
            int cnt=0;
            for(int j=i;j<i+k;j++)
            {
                
              if (j == 0) {
                    cnt++;
                    continue;
                }
                if (cnt > 0 && array[j] == array[j - 1] + 1) {
                    maxi = Math.max(maxi, array[j]);
                } else if (cnt == 0) {
                    cnt++;
                } else {
                    maxi = -1;
                    break;
                }
            }
            result[i]=maxi;
        }
        return result;
        
    }
}