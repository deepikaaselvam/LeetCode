class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int cnt =0;
        for(int index =0;index<arr.length;index+=1)
        {
        
            mpp.put(arr[index],mpp.getOrDefault(arr[index],0)+1);
        }
       
        HashSet<Integer>freqSet = new HashSet<>();
        for(int value :mpp.values())
        {
            if(!freqSet.add(value))
            {
                return false;
            }
        }
        return true;
        
    }
}