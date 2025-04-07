class Solution {
      private static void combinationSumI(int index,int []nums,int target,ArrayList<Integer>list,List<List<Integer>>ans)
    {
      
        if(index>=nums.length)
        {
            if(target ==0)
            {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(nums[index]<=target)
        {
            list.add(nums[index]);
            target = target - nums[index];
            combinationSumI(index,nums,target,list,ans);
            target +=list.get(list.size()-1);
            list.remove(list.size()-1);
        }
        combinationSumI(index+1,nums,target,list,ans);
    }
  
        
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>>ans=new ArrayList<>();
       ArrayList<Integer>list=new ArrayList<>();
       int n=candidates.length;
       combinationSumI(0,candidates,target,list,ans);
       return ans;

        
    }
}