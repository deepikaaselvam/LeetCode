class Solution {
    public int mostFrequentEven(int[] nums) {
        
    int[]answer = new int[100000];
        for(int index =0;index<nums.length;index+=1)
        {
            if(nums[index]%2==0)
            {
            answer[nums[index]]+=1;}
        }
        int maxi =0;
        int cnt =0;
        int safe =0;boolean flag =false;
        for(int index =0;index<answer.length;index+=1)
        {
            if(answer[index]>maxi)
            {
                maxi=answer[index];
                safe =index;
         
                flag =true;

            }
            // cnt+=1;
            // if(cnt == nums.length)
            // {
            //     break;
            // }
           
        }
            
      if(flag==false){return -1;}//no even number}
     return safe;
    }
}