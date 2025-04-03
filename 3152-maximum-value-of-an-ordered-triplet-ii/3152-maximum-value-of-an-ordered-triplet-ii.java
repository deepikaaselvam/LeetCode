class Solution {
    public long maximumTripletValue(int[] nums) {
            //inituition is to get the Maximum Value ;
            long maximum =Long.MIN_VALUE;
            long difference =0;
            long product =0;
            for(int num:nums)
            {
                maximum =Math.max(maximum,num);
                if(num>=2)
                {
                    product =Math.max(product,difference *num);
                }
                if(num>=1)
                {
                    difference =Math.max(difference,maximum-num);
                }
             

            }
            return product >0?product:0;

     
    }
}

/*
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

        */