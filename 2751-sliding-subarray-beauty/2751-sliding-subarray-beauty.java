class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n= nums.length;
        int[]frequency = new int[51];
        ArrayList<Integer>result = new ArrayList<Integer>();
        for(int i=0, j=0;i<nums.length;i++)
        {if(nums[i]<0)
            {
                frequency[Math.abs(nums[i])]++;
            }
            if(i-j+1>=k)
            {int cnt=0;
                for(int L=50;L>=1;L--)
                {
                    cnt+=frequency[L];
                    if(cnt>=x)
                    {  result.add(-L);
                        break;
                    }
                }
                if(cnt<x)
                {
                    result.add(0);
                }
                if(nums[j]<0)
                {
                    frequency[Math.abs(nums[j])]--;
                }
                 j++;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
       

        
    }
}