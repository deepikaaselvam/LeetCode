class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
         //less than Pivot ->List1
        ArrayList<Integer>list1 = new ArrayList<>();
        int cnt=0;
        //greater than pivot ->List2
        ArrayList<Integer>list2 = new ArrayList<>();
        for(int ind=0;ind<nums.length;ind++)
        {
            if(nums[ind]<pivot)
            {
                list1.add(nums[ind]);
            }
            else if(nums[ind]>pivot)
            {
                list2.add(nums[ind]);
            }
            else if(nums[ind]==pivot)
            {
                cnt++;
            }
        }
      
            int[]answer = new int[nums.length];
            int ind2=0;
            for(int LesserValue:list1)
            {
                answer[ind2]=LesserValue;
                ind2++;
            }
            for(int i=0;i<cnt;i++)
            {
                answer[ind2]=pivot;
                ind2++;
            }
            for(int GreaterValue:list2)
            {
                answer[ind2]=GreaterValue;
                ind2++;
            }
        return answer;
    }
}