class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        ArrayList<int[]>IntegerArray = new ArrayList<>();
        int ptr1 =0;
        int ptr2 =0;
        while(ptr1<nums1.length && ptr2 <nums2.length)
        {
            int[]eachFieldArray = new int[2];
            if(nums1[ptr1][0]==nums2[ptr2][0])
            {
                eachFieldArray[0]=nums1[ptr1][0];
                eachFieldArray[1]=nums1[ptr1][1]+nums2[ptr2][1];
                ptr1+=1;
                ptr2+=1;
            }
            else if(nums1[ptr1][0]<nums2[ptr2][0])
            {
                eachFieldArray[0]=nums1[ptr1][0];
                eachFieldArray[1]=nums1[ptr1][1];
                ptr1+=1;
            }
            else
            {
                eachFieldArray[0]=nums2[ptr2][0];
                eachFieldArray[1]=nums2[ptr2][1];
                ptr2+=1;
            }
            IntegerArray.add(eachFieldArray);
        }
        while(ptr1<nums1.length)
        {

              IntegerArray.add(nums1[ptr1]); 
                ptr1+=1;
        }
        while(ptr2<nums2.length)
        {
            IntegerArray.add(nums2[ptr2]);
            ptr2+=1;
        }
        return IntegerArray.toArray(new int[IntegerArray.size()][]);
         
       

        
    }
}
/*
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
       
        return mergeList.toArray(new int[mergeList.size()][]);
*/






/*ArrayList<int[]>IntegerArray = new ArrayList<>();
        int ptr1 =0;
        int ptr2 =0;
        while(ptr1<nums1.length && ptr2 <nums2.length)
        {
            int[]eachFieldArray = new int[2];
            if(nums1[ptr1][0]==nums2[ptr2][0])
            {
                eachFieldArray[0]=nums1[ptr1][0];
                eachFieldArray[1]=nums1[ptr1][1]+nums2[ptr2][1];
                ptr1+=1;
                ptr2+=1;
            }
            else if(nums1[ptr1][0]<nums2[ptr2][0])
            {
                eachFieldArray[0]=nums1[ptr1][0];
                eachFieldArray[1]=nums1[ptr1][1];
                ptr1+=1;
            }
            else
            {
                eachFieldArray[0]=nums2[ptr2][0];
                eachFieldArray[1]=nums2[ptr2][1];
                ptr2+=1;
            }
            IntegerArray.add(eachFieldArray);
        }
        while(ptr1<nums1.length)
        {

              IntegerArray.add(nums1[ptr1]); 
                ptr1+=1;
        }
        while(ptr2<nums2.length)
        {
            IntegerArray.add(nums2[ptr2]);
            ptr2+=1;
        }
        return IntegerArray.toArray(new int[IntegerArray.size()][]);
        */
         
       

    