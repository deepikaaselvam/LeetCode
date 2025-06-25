class Solution {
    public String largestNumber(int[] nums) {
        ArrayList<String>stringVal = new ArrayList<>();
        for(int ind =0;ind<nums.length;ind+=1)
        {
            stringVal.add(String.valueOf(nums[ind]));
        }
        stringVal.sort((s1,s2)->(s2+s1).compareTo(s1+s2));
       StringBuilder result = new StringBuilder();
       if(stringVal.get(0).equals("0"))
       {
            return "0";
       }
       for(int ind =0;ind<stringVal.size();ind+=1)
       {
            result.append(stringVal.get(ind));
       }
       return result.toString();
        
    }
}