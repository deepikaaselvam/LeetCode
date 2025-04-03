class Solution {
    public long maximumTripletValue(int[] nums) {
        //leftMax =x
      int leftMax[] = new int[nums.length];
      leftMax[0]=0;
        //rightMax=z
      int rightMax[] = new int[nums.length];
      rightMax[nums.length-1]=0;
      int max_Left =nums[0];
      for(int index1=1;index1<nums.length;index1+=1)
      {
       
        leftMax[index1]=Math.max(max_Left,nums[index1-1]);
         if(nums[index1]>max_Left)
        {
            max_Left= nums[index1];
        }
      }
      int max_Right = nums[nums.length-1];
      for(int index2=nums.length-2;index2>=0;index2-=1)
      {
        
        rightMax[index2]=Math.max(max_Right,nums[index2+1]);
        if(nums[index2]>max_Right)
        {
            max_Right = nums[index2];
        }

      }
      long maximum_Triplet =0;
      for(int answer =0;answer<nums.length;answer+=1)
      {
        long value =(leftMax[answer]-nums[answer]);
        long result = value * rightMax[answer];
        maximum_Triplet = Math.max(maximum_Triplet,result);

      }
      if(maximum_Triplet<0)
      {
        return 0;
      }
      return maximum_Triplet;

        
    }
}