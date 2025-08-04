class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]>answer = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       int start = intervals[0][0];
       int end = intervals[0][1];
       for(int ind =1;ind<intervals.length;ind+=1)
       {
            if(intervals[ind][0]<=end)
            {
                end=Math.max(end,intervals[ind][1]);
            }
            else
            {
                answer.add(new int[]{start,end});
                start=intervals[ind][0];
                end =intervals[ind][1];
            }
       }
           answer.add(new int[]{start,end});
        return answer.toArray(new int[answer.size()][]);
        
    }
}

/*
 for(int ind =0;ind<intervals.length;ind+=1)
        {
          int start = intervals[ind][0];
          int end = intervals[ind][1];
          int jind=ind;
          while(jind<intervals.length-1&& intervals[jind][1]>=intervals[jind+1][0])
          {
            end= Math.max(end,intervals[jind+1][1]);
            jind++;
          }
          answer.add(new int[]{start,end});
        ind=jind;
           
          
        }
        */