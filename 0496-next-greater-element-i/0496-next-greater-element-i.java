class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // //num2 is the largest array;
        // int Finalmaximum =-1;
        
         HashMap<Integer,Integer>mpp = new HashMap<>();
        // int lastElement =nums2[nums2.length-1];
        // // mpp.put(lastElement,0);
        // for(int i=nums2.length-1;i>=0;i--)
        // {
        //     if(i==nums2.length-1)
        //     {
        //         mpp.put(nums2[i],Finalmaximum);
        //         Finalmaximum = nums2[i]);
        //     }
        //     if(i==0 && nums2[i+1]>nums2[i])
        //     {
        //         mpp.put(nums2[i],nums2[i+1]);
        //     }
        //     else if(i!=nums2.length-1 && Finalmaximum>nums2[i])
        //     {
        //         mpp.put(nums2[i],nums2[i+1]);
        //     }
        //     else
        //     {
        //         // maximum =-1;
        //         mpp.put(nums2[i],-1);
        //     }
        // }
              for (int i = nums2.length - 1; i >= 0; i--) {
            int nextGreater = -1;
            for (int j = i + 1; j < nums2.length; j++) {
                if (nums2[j] > nums2[i]) {
                    nextGreater = nums2[j];
                    break;
                }
            }
            mpp.put(nums2[i], nextGreater);
        }
        int[]answer = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            if(mpp.containsKey(nums1[i]))
            {
                answer[i]=mpp.get(nums1[i]);
            }
        }
        return answer;
        
        
    }
}