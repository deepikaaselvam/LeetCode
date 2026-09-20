class Solution {
    int ans = 0;
    int finalAns =0;
    public int reverseDegree(String s) {
        for(int ind =1 ;ind<=s.length();ind++){
            char ch = s.charAt(ind-1);
            ans = ((int)('z' - ch) + 1) * ind;
            finalAns += ans;
            System.out.println(finalAns);
        }
        return finalAns;
        
    }
}