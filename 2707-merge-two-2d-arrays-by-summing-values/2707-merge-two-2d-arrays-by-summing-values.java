class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer>twoDArray = new TreeMap<>();
        for(int[] nums:nums1)
        {
            twoDArray.put(nums[0],nums[1]);
        }
        for(int[] nums:nums2)
        {
            if(twoDArray.containsKey(nums[0]))
            {
                 twoDArray.put(nums[0],twoDArray.getOrDefault(nums[0],0)+nums[1]);
            }
            else{
                twoDArray.put(nums[0],nums[1]);
            }
           
        }
        List<int[]>mergeList = new ArrayList<>();
        for(Map.Entry<Integer,Integer>Entryy:twoDArray.entrySet())
        {
            mergeList.add(new int[]{Entryy.getKey(),Entryy.getValue()});
        }
        int[][]mergeTwoDArray = new int[mergeList.size()][2];
        for(int i=0;i<mergeTwoDArray.length;i+=1)
        {
            mergeTwoDArray[i]=mergeList.get(i);
        }
        return mergeTwoDArray;

        
    }
}