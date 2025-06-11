class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[]answer = new int[101];
        for(int ind =0;ind<nums.length;ind+=1)
        {
            int value = nums[ind];
            answer[value]++;
        }
        Arrays.sort(answer);
        int cnt=0;
        int lastValue = answer[answer.length-1];
        for(int ind =answer.length-1;ind>=0;ind-=1)
        {
            if(answer[ind]==lastValue)
            {
                cnt+=lastValue;
            }
            else {
                break;
            }
            
        }
        return cnt;
        
    }
}