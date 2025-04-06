class Solution {
    public int largestAltitude(int[] gain) {
        int[]prefix =new int[gain.length+1];
        prefix[0]=0;
        int maximum =Integer.MIN_VALUE;
        for(int index =1;index<gain.length;index+=1)
        {
            prefix[index]=prefix[index-1]+gain[index-1];
            maximum=Math.max(maximum,prefix[index]);
        }
        prefix[gain.length]=prefix[gain.length-1]+gain[gain.length-1];
        maximum = Math.max(maximum,prefix[gain.length]);
        return maximum<0?0 :maximum;
        
    }
}