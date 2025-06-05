class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[]answer = new int[2];
        int left =0;int right= numbers.length-1;
        while(left<right)
        {
            int sum = numbers[left]+numbers[right];
            if(sum==target)
            {
                answer[0]=left+1;
                answer[1]=right+1;
                break;
            }
            else if(sum<target)
            {
                left+=1;
            }
            else if(sum>target)
            {
                right-=1;
            }
        }
        // for(int ind =0;ind<numbers.length-1;ind+=1)
        // {
        //     for(int jind = ind+1;jind<numbers.length;jind+=1)
        //     {
        //         int sum =numbers[ind]+numbers[jind];
        //         if(sum==target)
        //         {
        //             answer[0]=ind+1;
        //             answer[1]=jind+1;
        //         }
        //     }
        // }
        return answer;
        
    }
}