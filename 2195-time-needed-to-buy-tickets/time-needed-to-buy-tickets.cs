public class Solution {
    public int TimeRequiredToBuy(int[] tickets, int k) {
        int cnt =0;
        for(int ind =0;ind<tickets.Length;ind++){
            if(ind<=k){
                cnt+=Math.Min(tickets[ind],tickets[k]);
            }else if(ind>k){
                cnt+=Math.Min(tickets[ind],tickets[k]-1);
            }
        }
        return cnt;
        
    }
}