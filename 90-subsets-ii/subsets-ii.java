class Solution {
       private static List<List<Integer>> printsubSetSumII(int ind ,int[]nums,ArrayList<Integer>temporary,List<List<Integer>>finalAns)
    {
        if(ind==nums.length)
        {
            if( !finalAns.contains(temporary))
            {
                // Collections.sort(new ArrayList<>(temporary));
                finalAns.add(new ArrayList<>(temporary));
                // System.out.println(finalAns);
            }
            return finalAns;
        }
        temporary.add(nums[ind]);
        printsubSetSumII(ind+1, nums, temporary, finalAns);
        temporary.remove(temporary.size()-1);
        return printsubSetSumII(ind+1, nums, temporary, finalAns);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer>collectElements = new ArrayList<>();
        List<List<Integer>>distinctElem = new ArrayList<>();
        Arrays.sort(nums);
         return  printsubSetSumII(0,nums,collectElements,distinctElem);
        
    }
}