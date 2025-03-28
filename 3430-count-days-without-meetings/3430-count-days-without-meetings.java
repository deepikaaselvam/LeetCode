class Solution {
    public int countDays(int days, int[][] meetings) {
    int freedays =0,latestEnd =0;
     Arrays.sort(meetings,Comparator.comparingInt(one->one[0]));
     for(int index =0;index< meetings.length;index+=1)
     {
       
        int start = meetings[index][0];
        int end = meetings[index][1];
        if(start>latestEnd+1)
        {
            freedays+=(start-latestEnd-1);
        }
        latestEnd =Math.max(latestEnd,end);
    }
     freedays +=(days - latestEnd);
     return freedays;
    }
}
/*
int cnt =0;
        int[]check =new int[days+1];
        check[0]=1;
        for(int index =0;index<meetings.length;index+=1)
        {
            int start = meetings[index][0];
            int end = meetings[index][1];
            for(int jIndex =start;jIndex<=end;jIndex+=1)
            {
                check[jIndex] = 1;
                
            }
        }
        for(int valueCheck =1 ;valueCheck<check.length ; valueCheck+=1)
        {
            if(check[valueCheck]==0)
            {
                cnt+=1;
            }
        }
        return cnt;
*/