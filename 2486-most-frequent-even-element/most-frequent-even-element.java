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
        int value =0;int cnt =0;
        int safe =0;boolean flag =false;
        for(int index =0;index<answer.length;index+=1)
        {
            if(answer[index]>maxi)
            {
                maxi=answer[index];
                safe =index;
                value =answer[index];
                flag =true;

            }
           
        }
            
      if(flag==false){return -1;}//no even number}
     return safe;
    }
}