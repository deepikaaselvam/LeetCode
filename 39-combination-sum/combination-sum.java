class Solution {
    public static void combinationSumI(int i,int[]array,int  target,              ArrayList<Integer>list,List<List<Integer>>answer)
    {
        if(i==array.length)
        {
            if(target==0)
            {
                answer.add(new ArrayList<>(list));
            }
            return;
        }
        if(array[i]<=target)
        {
            list.add(array[i]);
            combinationSumI(i,array,target-array[i],list,answer);
            list.remove(list.size()-1);
        }
        combinationSumI(i+1,array,target,list,answer);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>>ans=new ArrayList<>();
       ArrayList<Integer>list=new ArrayList<>();
       int n=candidates.length;
       combinationSumI(0,candidates,target,list,ans);
       return ans;

        
    }
}