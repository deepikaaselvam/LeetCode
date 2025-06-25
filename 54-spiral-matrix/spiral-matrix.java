class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
        // int row = nums.length-1;
        // int col=nums[row].length-1;
          int right=0,left=nums[0].length-1;
        int bottom = 0,top=nums.length-1;
        List<Integer>answer = new ArrayList<>();
        while(right<=left && bottom<=top)
        {
            for(int ind =right;ind<=left;ind+=1)
            {
                answer.add(nums[bottom][ind]);
            }
            bottom+=1;
            // System.out.println();
            for(int ind =bottom;ind<=top;ind+=1)
            {
                answer.add(nums[ind][left]);
            }
            left-=1;
            // System.out.println();
            if(bottom<=top)
            {
                for(int ind =left;ind>=right;ind-=1)
                {
                    answer.add(nums[top][ind]);
                }
                top-=1;
            }
            System.out.println();
            if(right<=left)
            {
                for(int ind =top;ind>=bottom;ind-=1)
                {
                    answer.add(nums[ind][right]);
                }
                right+=1;
            }
        }
        return answer;
        
        
        
    }
}