class Solution {
    public int threeSumMulti(int[] nums, int target) {
        long result =0;
        HashMap<Integer,Long>mpp = new HashMap<>();
        for(int numss:nums)
        {
            mpp.put(numss,mpp.getOrDefault(numss,0l)+1);
        }
        System.out.println(mpp.size());
        ArrayList<Integer>list = new ArrayList<>(mpp.keySet());
        Collections.sort(list);
        for(int i =0 ;i<list.size();i+=1)
        {
            Integer ind = list.get(i);
            for(int j =i;j<list.size();j+=1)
            {
                Integer jind = list.get(j);
                int Kind = target - (ind+jind);
                 if(!mpp.containsKey(Kind)) continue;
                   if(Kind<jind) continue;
                   if(mpp.containsKey(Kind))
                   {
                     long val1= mpp.get(ind);
                    long val2= mpp.get(jind);
                    long val3= mpp.get(Kind);
                     if(ind.equals(jind) && jind.equals(Kind))
                     {
                        result+=(val1 *(val1-1)*(val1-2))/6;
                     }
                     else if(ind.equals(jind) && !jind.equals(Kind))
                     {
                        result +=(val1*(val1-1))/2*(val3);
                     }
                      else if(ind <jind && jind.equals(Kind))
                     {
                        result +=(val1)*(val2 *(val2-1))/2;
                     }
                     else if(ind<jind && jind<Kind )
                     {
                        result +=(val1*val2*val3);
                     }

                   }
                   result = result % 1000000007;
        
                }    
            }
            return (int) result;
     }
}

        // HashMap<Integer,Integer>mpp = new HashMap<>();
        // int answer=0;
        // for(int index=0;index<arr.length;index+=1)
        // {
        //     mpp.put(arr[index],mpp.getOrDefault(arr[index],0)+1);
        // }
        // int length = arr.length;
        // for(int ind =0;ind<(length-2);ind+=1)
        // {
        //     for(int jind =ind+1;jind<(length-1);jind+=1)
        //     {
        //         int cnt=0;
        //         for(int kInd =jind+1;kInd<(length);kInd+=1)
        //         {
        //             int triplets = arr[ind]+arr[jind]+arr[kInd];
        //             int sum = arr[ind]+arr[jind];
        //             int value = target-sum;
        //             if(mpp.containsKey(value)&& mpp.get(value)!=cnt)
        //             {
                        
                        
        //                 if(triplets==target)
        //                 {
        //                     answer+=1;
        //                     cnt++;
        //                 }
        //                 else
        //                 {
        //                    continue;
        //                 }
        //             }
        //             else {
        //                 break;
        //             }

        //         }

        //     }
        // }
        // return answer;
        
