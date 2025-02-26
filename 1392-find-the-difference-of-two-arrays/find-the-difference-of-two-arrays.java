class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        HashSet<Integer>set1= new HashSet<>();
        HashSet<Integer>set2= new HashSet<>();
        for(int number1:nums1)
            set1.add(number1);
          for(int number2:nums2)
            set2.add(number2);

        List<Integer>list1 = new ArrayList<>();
        List<Integer>list2 = new ArrayList<>();
        for(int ans1:set1)
            if(!set2.contains(ans1))
            {
                list1.add(ans1);
            }
        answer.add(list1);
        for(int ans2:set2)
            if(!set1.contains(ans2))
            {
                list2.add(ans2);
            }
        answer.add(list2);


        return answer;
    
        
        
    }
}
/*
 HashMap<Integer,Integer>mpp1 = new HashMap<>();
        HashMap<Integer,Integer>mpp2 = new HashMap<>();
        List<List<Integer>>answer = new ArrayList<>();
       
        for(int i=0;i<nums1.length;i++)
        {
            mpp1.put(nums1[i],mpp1.getOrDefault(nums1[i],0)+1);
        }
        for(int j =0;j<nums2.length;j++)
        {
            mpp2.put(nums2[j],mpp2.getOrDefault(nums2[j],0)+1);
        }
         List<Integer>subList1= new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
           
            if(!mpp2.containsKey(nums1[i]) && !subList1.contains(nums1[i]))
            {
                subList1.add(nums1[i]);
            }
        }
        answer.add(subList1);
         List<Integer>subList2 = new ArrayList<>();
        for(int j=0;j<nums2.length;j++)
        {
           
            if(!mpp1.containsKey(nums2[j])&& !subList2.contains(nums2[j]))
            {
                subList2.add(nums2[j]);
            }
        }
        answer.add(subList2);
        return answer;
        */