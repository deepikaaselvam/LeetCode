class Solution {
    private static void combinationalSumII(int ind,int[]nums,int target,ArrayList<Integer>list,List<List<Integer>>ans)
    {
        if(target ==0)
        {
             ans.add(new ArrayList<>(list));
            return;
        }
               
         
        for(int index =ind;index<nums.length;index+=1)
        {
            if(index>ind && nums[index]==nums[index-1])
            {continue;} 
            if(nums[index]>target) break;
            list.add(nums[index]);

            combinationalSumII(index+1,nums, target-nums[index], list,ans);
          
            list.remove(list.size()-1);

        }
        
    }
   
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        ArrayList<Integer>list=new ArrayList<>();
        List<List<Integer>>answer=new ArrayList<>();
        Arrays.sort(candidates);
        combinationalSumII(0,candidates,target,list,answer);
        return answer;

        
    }
}