class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>mpp1 = new HashMap<>();
        HashMap<Integer,Integer>mpp2 = new HashMap<>();
        List<List<Integer>>answer = new ArrayList<>();
        // int cnt1=0;
        // int cnt2=0;
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
        
        
    }
}