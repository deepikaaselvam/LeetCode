class Solution {
    public int[] transformArray(int[] nums) {
        int evenCnt =0;
        int oddCnt =0;
        for(int index =0 ;index<nums.length;index+=1)
        {
            if(nums[index]%2==0)  evenCnt+=1;
            else
                oddCnt+=1;
        }
        int[]answer = new int[nums.length];
        for(int index2 =0 ; index2<evenCnt;index2+=1)
        {
                answer[index2]=0;
        }
        for(int index3=evenCnt;index3<evenCnt+oddCnt;index3+=1)
        {
            answer[index3]=1;
        }
        return answer;
        
    }
}