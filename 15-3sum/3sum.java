class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        /*for(int i=0;i<nums.length;i++)
        {   HashSet<Integer>set = new HashSet<>();
            for(int j=i+1;j<nums.length;j++)
            {   int Thirdelement = -(nums[i]+nums[j]);
                if(set.contains(Thirdelement))
                    {   List<Integer>triplet = Arrays.asList(nums[i],nums[j],Thirdelement);
                        Collections.sort(triplet);
                        if(!result.contains(triplet))
                        {
                            result.add((triplet));
                        }
                    }
                set.add(nums[j]);
            }
        }
        return result;*/
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0)
                {
                    j++;
                }
                else if(sum==0)
                {
                    List<Integer>triplet =Arrays.asList(nums[i],nums[j],nums[k]);
                    result.add(triplet);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1])
                    {
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1])
                    {
                        k--;
                    }  
                }
                else if(sum>0)
                {
                    k--;
                }
              
            }
        }
        return result;
    }
}