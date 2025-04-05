class Solution {
    private static int subsequencesXOR(int index ,int[]nums,ArrayList<Integer>list,int sum)
    {
        if(index>=nums.length)
        {
            int xor=0;
            for(int ind =0;ind<list.size();ind+=1)
            {
                xor=xor ^ list.get(ind);
            }
           
            return xor;

        }
        list.add(nums[index]);
        int include = subsequencesXOR(index+1,nums,list,sum);
        list.remove(list.size()-1);
        int exclude =subsequencesXOR(index+1,nums,list,sum);
        return include+exclude;

    }
    public int subsetXORSum(int[] nums) {
        int sum=0;
        ArrayList<Integer>list = new ArrayList<>();
        return subsequencesXOR(0,nums,list,sum);
        
    }
}