class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long c1 = cost1, c2 = cost2, cb = costBoth;
        long n1 = need1, n2 = need2;
        long opt1 = (n1 * c1) +(n2 * c2);
        long commonValue = Math.min(n1, n2);
        long opt2 = commonValue * cb + (n1 - commonValue) * c1+  (n2 - commonValue) * c2;
        long opt3 = Math.max(n1, n2) * cb;
        return Math.min(opt1, Math.min(opt2, opt3));
        
    }
}